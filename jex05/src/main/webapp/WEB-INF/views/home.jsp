<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel='stylesheet' href='/webjars/bootstrap/4.3.1/css/bootstrap.min.css'>
	<title>Home</title>
</head>
<body>
<div class="container-fluid">
<div class="page-header">

<h1>Hello world!</h1>
<P class="lead">  The time on the server is ${serverTime}. </P>
<P class="lead"> <a href="/hr">HR</a> </P>
<P class="lead"> <a href="/board/list">Board List</a> </P>

https://pmd.github.io/latest/pmd_userdocs_tools.html#eclipse
http://www.egovframe.go.kr/wiki/doku.php?id=egovframework:dev2:imp:inspection:usetool#%EC%A0%84%EC%9E%90%EC%A0%95%EB%B6%80_%ED%91%9C%EC%A4%80_inspection
</div><!-- /.page-header -->
</div><!-- /.container -->

<script src="/webjars/jquery/3.3.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script> 
<script type="text/javascript">
  $(function () {
    console.log("jQuery ready");
  });
</script>
</body>
</html>
