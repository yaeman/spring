package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao; //dao객체를 만들어서 쏙 껴준다.. 
	
	
	@RequestMapping("insert2")
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert요청 됨.");
		System.out.println("입련한 id는" + id);
		System.out.println("입련한 pw는" + title);
		System.out.println("입련한 name는" + content);
		System.out.println("입련한 tel는" + writer);
		dao.insert(id, title, content, writer);
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete2요청 됨.");
		System.out.println("삭제할 id는" + id);
		dao.delete2(id);
	}

}
