<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	//1.����̹� ����
	Class.forName("com.mysql.jdbc.Driver");
    out.print("1. ����̹� ���� ����!");
    
	//2.DB����
	String url = "jdbc:mysql://localhost:3306/spring"; // ������ db
	String user = "root"; // id
	String password = "1234"; // pw
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. DB���� ����!!");
	
	//3.SQL����
	String sql = "insert into member values (?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, pw);
	ps.setString(3, name);
	ps.setString(4, tel);
	out.print("3. SQL���� ����!!");
	
	//4.SQL����
	ps.executeUpdate();
	out.print("4. SQL���� ����!!");
	
%>
</body>
</html>