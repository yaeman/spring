package com.kgitbank.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	
		
	public void insert(String content, String writer) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
		    
			System.out.print("1. ����̹� ���� ����!");
		    

			String url = "jdbc:mysql://localhost:3306/spring"; // ������ db
			String user = "root"; // id
			String password = "1234"; // pw
			Connection con = DriverManager.getConnection(url, user, password);
			
//			String sql = "insert into reply values (?, null)";
			String sql = "insert into reply values (?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, writer);
	
			System.out.print("3. SQL���� ����!!");
			
			//4.SQL����
			ps.executeUpdate();
			System.out.print("4. SQL���� ����!!");
			
		}
}
			
	

			
	
