package com.kgitbank.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao; //dao객체를 만들어서 쏙 껴준다.. 
	
	
	@RequestMapping("insert2.do")
	public void insert(BbsDTO bbsDTO) throws Exception {
		System.out.println("insert요청 됨.");
		System.out.println("입련한 id는" + bbsDTO.getId());
		System.out.println("입련한 pw는" + bbsDTO.getTitle());
		System.out.println("입련한 name는" + bbsDTO.getContent());
		System.out.println("입련한 tel는" + bbsDTO.getWriter());
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete2요청 됨.");
		System.out.println("삭제할 id는" + id);
		dao.delete2(id);
	}

}
