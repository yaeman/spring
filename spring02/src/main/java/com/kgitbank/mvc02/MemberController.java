package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.mvc03.MemberDAO;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //dao객체를 만들어서 쏙 껴준다.. 
	
	
	@RequestMapping("insert")
	public void insert(String id, String pw, String name, String tel) throws Exception {
		System.out.println("insert요청 됨.");
		System.out.println("입련한 id는" + id);
		System.out.println("입련한 pw는" + pw);
		System.out.println("입련한 name는" + name);
		System.out.println("입련한 tel는" + tel);
		dao.insert(id, pw, name, tel);
	}
	
	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {
		//String id = request.getParamet
		System.out.println("select요청 됨.");
		System.out.println("검색할 id는" + id);
		MemberDTO dto2= dao.select(id);
		//Model객체는 views까지만 값을 넘기고
		//싶을 때 사용.(session과 유사하지만, 더 좁다.)
		model.addAttribute("dto2", dto2);
	}
	
	@RequestMapping("delete")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete요청 됨.");
		System.out.println("삭제할 id는" + id);
		dao.delete(id);
	}


}
