package com.kgitbank.mvc05;


import org.springframework.stereotype.Repository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class BookMarkDAO_old {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert (BookMarkDTO dto) throws Exception {
		my.insert("book.insert",dto);
	
	}

}
