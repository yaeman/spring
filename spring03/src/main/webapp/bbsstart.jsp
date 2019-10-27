<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css"/> 
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function() {
		var  springValue = $('#spring').val()
		alert('입력되어 있는 spring값은' + springValue)
		
		var  funValue = $('#fun').val()
		alert('입력되어 있는 fun값은' + funValue)
		
		var  parkValue = $('#park').val()
		alert('입력되어 있는 park값은' + parkValue)
		
	});


</script>

</head>
<body>
제목 <input type="text" name="title" class="title" value="spring" id="spring"><br>
내용 <input type="text" name="title" class="content" value="fun spring" id="fun"><br>
작성자 <input type="text" name="title" class="writer" value="park" id="park"><br>
</body>
</html>