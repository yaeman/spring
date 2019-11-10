package com.kgitbank.mvcFinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("select2")
	public void select(ProductDTO productDTO, Model model) {
		System.out.println("��Ʈ�ѷ� �Ѿ����.");
		ProductDTO dto = dao.select(productDTO);
		model.addAttribute("dto", dto);
		System.out.println(dto);
		
		//��� ������ ����
		System.out.println("---------------------");
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setProductId(dto.getId());
		List<ReplyDTO> list = dao2.selectAll(dto2);
		model.addAttribute("list", list);
		
		for (ReplyDTO replyDTO : list) {
			System.out.println(replyDTO);
		}
		
		
		
		
		
	}
	
	
	@RequestMapping("selectAll2")
	public void selectAll(Model model) {
		List<ProductDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		
		for (int i = 0; i < list.size(); i++) {
			//����Ʈ�� ����ִ� dto�� ������.
			ProductDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getPrice());
			System.out.println(dto.getImg());
			System.out.println("-------------------");
		}
	}
}
