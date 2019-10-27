package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	public void delete2(String id) throws Exception {
		
		
		//Model(M)
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
		    
			//View(V)
			System.out.print("1. ����̹� ���� ����!");
		    
			//2.DB����
			String url = "jdbc:mysql://localhost:3306/spring"; // ������ db
			String user = "root"; // id
			String password = "1234"; // pw
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.print("2. DB���� ����!!");
			
			//3.SQL����
			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.print("3. SQL���� ����!!");
			
			//4.SQL����
			ps.executeUpdate();
			System.out.print("4. SQL���� ����!!");
			
		}
	
	//�ڵ� import ctrl + shift + o(����)
	public void insert(String id, String title, String content, String writer) throws Exception {
		
	
	//Model(M)
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
	    
		//View(V)
		System.out.print("1. ����̹� ���� ����!");
	    
		//2.DB����
		String url = "jdbc:mysql://localhost:3306/spring"; // ������ db
		String user = "root"; // id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2. DB���� ����!!");
		
		//3.SQL����
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.print("3. SQL���� ����!!");
		
		//4.SQL����
		ps.executeUpdate();
		System.out.print("4. SQL���� ����!!");
		
	}
		
}
