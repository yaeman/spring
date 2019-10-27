<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('.fruit').keyup(function() {
			correct = 'apple'
			
			fruitValue = $('.fruit').val()
			if(fruitValue== correct){
				$('.d1').text('정답.')
			}else{
			//alert('입력값 id가 너무 짧습니다. 5글자 이상 입력해주세요.')
				$('.d1').text('오답.')
			} // else end.
		});	//keyup end.
	});	// $ end.
	
	
</script>

</head>
<body>
	정답 과일 이름 입력: <input type="text" name="fruit" class="fruit"><br>
	<div class="d1" style="color:red;"></div><br>
</body>
</html>