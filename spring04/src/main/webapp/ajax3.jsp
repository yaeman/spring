<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() { //body���� �ν��ϰ�, �ڹ� ��ũ��Ʈ���ּ���.
		$('.btn1').click(function() {
			//��ư�� Ŭ�� �ϸ�, �Է��� ���� ������ �´�.
			reValue = $('.reply').val()
			wrValue = $('.writer').val()
			
			$.ajax({
				url : "server.do",
				data : {
					reply : reValue,
					writer : wrValue
				},
				success : function(result) {
					alert("������ ��� ����...!!!")
					$('.d1').append('<img src=resources/img/school.jpg width=100 height=100>')
					$('.d1').append(result)
				}
			});
		});
	});
</script>
</head>
<body>
<input type="text" class="reply" name="reply">
<input type="text" class="writer" name="writer">
<input type="button" class="btn1" value="��� �ޱ�">


<div class="d1"> </div>



</body>
</html>