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
		alert('�ԷµǾ� �ִ� spring����' + springValue)
		
		var  funValue = $('#fun').val()
		alert('�ԷµǾ� �ִ� fun����' + funValue)
		
		var  parkValue = $('#park').val()
		alert('�ԷµǾ� �ִ� park����' + parkValue)
		
	});


</script>

</head>
<body>
���� <input type="text" name="title" class="title" value="spring" id="spring"><br>
���� <input type="text" name="title" class="content" value="fun spring" id="fun"><br>
�ۼ��� <input type="text" name="title" class="writer" value="park" id="park"><br>
</body>
</html>