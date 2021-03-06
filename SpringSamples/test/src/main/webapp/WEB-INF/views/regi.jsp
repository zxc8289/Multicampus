<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding|Noto+Sans+KR&display=swap"
	rel="stylesheet">
<style>
* {
	margin: 0;
	padding: 0;
}

h1 {
	text-align: center;
	margin: 55px 0 35px 0;
}

h3 {
	margin-left: 15%;
	margin-bottom: 10px;
}

#btn1 {
	text-align: center;
	margin: 55px 0 35px 0;
}

#sub:hover {
	background-color: #316aff;
	color: white;
}

#sub {
	border: 2px solid #316aff;
	border-radius: 50px;
	padding: 10px 70px;
	text-decoration: inherit;
	font-weight: 30;
	font-size: 20px;
	color: #316aff;
	-webkit-transition-duration: 200ms;
	transition-duration: 200ms;
}

.ta {
	border-top: 2px solid #999999;
	border-bottom: 2px solid #999999;
	width: 70%;
	margin: auto;
}

.ta th, .ta td {
	height: 40px;
	border-top: 1px solid #cccccc;
	border-left: 1px solid #cccccc;
	font-size: 13px;
}

.ta th:first-child {
	border-left: none;
}

.ta tr:first-child th {
	border-top: none;
}

.ta tr:first-child td {
	border-top: none;
}

.ta th {
	padding: 10px 10px 10px 55px;
	text-align: left;
	font-size: 13px;
	color: #222222;
}

.ta td {
	padding: 10px 55px;
	color: #777777;
}

.ab {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
}

.tel {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-left: 5px;
}

.m {
	margin-left: 5px;
}

.bo {
	width: 60px;
	height: 25px;
	padding-bottom: 5px;
}

.box {
	width: 90px;
	height: 25px;
	padding-bottom: 5px;
}

.ap {
	vertical-align: middle;
	margin: 0 10px 0 10px;
	border: 1px solid rgb(190, 186, 186);
	background-color: #dddcdc;
	border-radius: 50px;
	padding: 2px 6px;
}

.bb {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-top: 10px;
}

.ac {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-right: 10px;
}

.app {
	text-decoration: none;
	color: black;
	font-family: 'Noto Sans KR', sans-serif;
}

.re {
	text-decoration: none;
	border: 2px solid gray;
	padding: 5px 20px;
	border-radius: 50px;
	color: black;
}

.h4 {
	text-align: center;
	margin-top: 20px;
	margin-left: 800px;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>

	<h1>????????????</h1>
	<h3 class="h3">????????????</h3>
	<form id="frm" action="regiAf.do" method="post">
		<table class="ta">
			<caption></caption>
			<colgroup>
				<col style="width: 200px;">
				<col>
			</colgroup>
			<tbody>
				<tr>
					<th>?????????</th>
					<td><input type="text" class="ab" name="id" id="id"
						style="width: 150px"> <span class="ap"><a href="#"
							id="btn" class="app">????????? ??????</a></span><span class="info">????????? ?????? ???
							<strong>'????????? ????????????'</strong> ????????? ??????????????????
					</span> <br>
						<p id="idcheck" style="font-size: 12px; margin-top: 10px"></p></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="password" class="ac" name="pwd" id="pwd"
						style="width: 150px;"><span class="info">???????????????
							4~10????????? ?????????????????? ????????????.</span></td>

				</tr>
				<tr>
					<th>??????</th>
					<td><input type="text" name="name" id="name" class="ab"
						style="width: 150px;"></td>
				</tr>
				<tr>
					<th>?????????</th>
					<td><input type="text" name="email" id="email" class="ab"
						style="width: 150px;"></td>
				</tr>
				<tr>
					<th>?????????</th>
					<td><input type="text" name="nickname" id="nickname" class="ab"
						style="width: 150px;">
					</td>
				</tr>
				
			</tbody>
		</table>
		<h4 class="h4">
			<a href="login.do" class="re">????????????</a>
		</h4>
		<h3 id="btn1">
			<button type="button" onclick="account()" id="sub">????????????</button>
		</h3>
	</form>
	<script type="text/javascript">
		$(document).ready(function() {

			$("#btn").click(function() {
				//	alert('btn click');
				//	let id = $("#id").val();
				//	alert(id);

				// id ?????? -> ajax
				$.ajax({
					url : "idcheck.do",
					type : "post",
					data : {
						id : $("#id").val()
					},
					success : function(msg) {
						//	alert('success');
						//	alert(msg);

						if (msg == "YES") {
							$("#idcheck").css("color", "#0000ff");
							$("#idcheck").html("????????? ??? ?????? ??????????????????");
						} else {
							$("#idcheck").css("color", "#ff0000");
							$("#idcheck").html("?????? ?????? ??????????????????");
							$("#id").val("");
						}
					},
					error : function() {
						alert('error');
					}
				});
			});
		});

		function account() {
			//	alert('account');

			if ($("#id").val() == '') {
				alert('???????????? ????????? ????????????');
			} else if ($("#pwd").val() == '') {
				alert('??????????????? ????????? ????????????');
			} else if ($("#name").val() == '') {
				alert('????????? ????????? ????????????');
			} else if ($("#email").val() == '') {
				alert('???????????? ????????? ????????????');
			} else if ($("#nickname").val() == '') {
				alert('???????????? ????????? ????????????');
			} else {
				$("#frm").submit();
			}
		}
	</script>




</body>
</html>







