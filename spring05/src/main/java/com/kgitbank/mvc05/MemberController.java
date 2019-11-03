package com.kgitbank.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; 

	@RequestMapping("memberAll")
	public void selectAll(Model model) throws Exception {
		System.out.println("��ü �˻� ��û��.");
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list2",list);
	}

}
