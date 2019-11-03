package com.kgitbank.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BookMarkDAO_old {

	public void insert(BookMarkDTO dto) throws Exception {
		// 1. db ����̹�(Ŀ����) ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ����.");
			
		// 2. db����(db�ּ�, id, pw)
			String url = "jdbc:mysql://localhost:3306/spring";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db���� ����.");
			
		// 3. sql�� ����
			String sql = "insert into bookmark values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getSite());
			
			System.out.println("3. sql�� ���� ����.");
			
		// 4. sql�� ����
			ps.executeUpdate();
			System.out.println("4. sql�� ���� ����.");
			
		// 5. �˻��� ��쿡�� ���� ������ ó��
	}

}
