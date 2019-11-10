package com.kgitbank.mvcFinal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public ProductDTO select(ProductDTO dto){
		return my.selectOne("product.select", dto);
	}
	
	public List<ProductDTO> selectAll(){
		return my.selectList("product.selectAll");
	}
	
}
