package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao; //dao��ü�� ���� �� ���ش�.. 
	
	
	@RequestMapping("insert2")
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert��û ��.");
		System.out.println("�Է��� id��" + id);
		System.out.println("�Է��� pw��" + title);
		System.out.println("�Է��� name��" + content);
		System.out.println("�Է��� tel��" + writer);
		dao.insert(id, title, content, writer);
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete2��û ��.");
		System.out.println("������ id��" + id);
		dao.delete2(id);
	}

}
