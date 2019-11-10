package com.kgitbank.mvcFinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("select")
	public void select(BbsDTO bbsDTO, Model model) {
		System.out.println("컨트롤러 넘어왔음.");
		BbsDTO dto = dao.select(bbsDTO);
		model.addAttribute("dto", dto);
		System.out.println(dto);
	}
	
	
	@RequestMapping("selectAll")
	public void selectAll(Model model) {
		List<BbsDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		
		for (int i = 0; i < list.size(); i++) {
			//리스트에 들어있는 dto를 꺼낸다.
			BbsDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getWriter());
			System.out.println("-------------------");
		}
	}
}





