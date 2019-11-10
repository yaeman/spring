package com.kgitbank.mvcFinal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sun.webkit.BackForwardList;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public BbsDTO select(BbsDTO dto){
		return my.selectOne("bbs.select", dto);
	}
	
	public List<BbsDTO> selectAll(){
		return my.selectList("bbs.selectAll");
	}
	
}





