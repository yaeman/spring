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

			
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.theguardian.com%2Finternational%2Frss&api_key=vdvsyga88m9zldw35yusnx5vkulzvwvybpdssqty",
				data : {
					url: "http://www.chosun.com/site/data/rss/ent.xml",
					api_key: "vdvsyga88m9zldw35yusnx5vkulzvwvybpdssqty" ,
					count: 20
				},
				success : function(result) {
					alert("�����Ϻ� ����Ʈ�� ���� ����...!!!")
					alert(result)
				}
			});
		});
	});
</script>
</head>
<body>
<input type="button" class="btn1" value="�Ź���� �ܾ����">
<div class="d1"> </div>



</body>
</html>