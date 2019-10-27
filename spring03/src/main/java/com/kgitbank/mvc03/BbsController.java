package com.kgitbank.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao; //dao��ü�� ���� �� ���ش�.. 
	
	
	@RequestMapping("insert2.do")
	public void insert(BbsDTO bbsDTO) throws Exception {
		System.out.println("insert��û ��.");
		System.out.println("�Է��� id��" + bbsDTO.getId());
		System.out.println("�Է��� pw��" + bbsDTO.getTitle());
		System.out.println("�Է��� name��" + bbsDTO.getContent());
		System.out.println("�Է��� tel��" + bbsDTO.getWriter());
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete2��û ��.");
		System.out.println("������ id��" + id);
		dao.delete2(id);
	}

}
