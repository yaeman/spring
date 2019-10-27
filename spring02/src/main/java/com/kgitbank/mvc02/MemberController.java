package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgitbank.mvc03.MemberDAO;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao; //dao��ü�� ���� �� ���ش�.. 
	
	
	@RequestMapping("insert")
	public void insert(String id, String pw, String name, String tel) throws Exception {
		System.out.println("insert��û ��.");
		System.out.println("�Է��� id��" + id);
		System.out.println("�Է��� pw��" + pw);
		System.out.println("�Է��� name��" + name);
		System.out.println("�Է��� tel��" + tel);
		dao.insert(id, pw, name, tel);
	}
	
	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {
		//String id = request.getParamet
		System.out.println("select��û ��.");
		System.out.println("�˻��� id��" + id);
		MemberDTO dto2= dao.select(id);
		//Model��ü�� views������ ���� �ѱ��
		//���� �� ���.(session�� ����������, �� ����.)
		model.addAttribute("dto2", dto2);
	}
	
	@RequestMapping("delete")
	public void delete(String id) throws Exception {
		//String id = request.getParamet
		System.out.println("delete��û ��.");
		System.out.println("������ id��" + id);
		dao.delete(id);
	}


}
