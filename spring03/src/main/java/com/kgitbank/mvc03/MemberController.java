package com.kgitbank.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	//dao�� ���� ��ü�� ã�´�
	@Autowired
	MemberDAO dao; //�̱���
	//���������� ����� ��ü�� �� 1���� ����
	//��𼭵��� �� ��ü�� �ּҰ��� ������ ����� �� �ִ� ���.
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) throws Exception {
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		dao.insert(memberDTO);
	}

}
