<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<!-- Run As-Run on Server 실행 시 jsp 파일에서는 404에러로 열리지 않고,
	프로젝트 클릭하여 실행해야한다. -->
</body>
</html>
