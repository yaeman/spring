package com.kgitbank.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookMarkController {
	
	@Autowired
	BookMarkDAO dao;
	
	@RequestMapping("selectAll")
	public void selectAll(Model model) throws Exception {
		System.out.println("��ü �˻� ��û��");
		List<BookMarkDTO> list = dao.selectAll();
		model.addAttribute("result", list);
	}
	
	@RequestMapping("selectOne")
	public void selectOne(BookMarkDTO bookMarkDTO, Model model) throws Exception {
		System.out.println(bookMarkDTO.getId());
		BookMarkDTO dto = dao.selectOne(bookMarkDTO);
		model.addAttribute("result", dto);
	}
	
	@RequestMapping("delete")
	public void delete(BookMarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getId());
		dao.delete(bookMarkDTO);
	}
	
	@RequestMapping("update")
	public void update(BookMarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getId());
		System.out.println(bookMarkDTO.getName());
		dao.update(bookMarkDTO);
	}
	
	@RequestMapping("insert")
	public void insert(BookMarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getId());
		System.out.println(bookMarkDTO.getName());
		System.out.println(bookMarkDTO.getSite());
		dao.insert(bookMarkDTO);
	}

}
