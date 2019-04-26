<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>File Upload:</h3>
      Select a file to upload: <br />
    <form action="single-upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" size= "50" />
        <br />
        <input type = "submit" value="Upload File" />
    </form>


	<img alt="test" src="${pageContext.servletContext.contextPath}/img/burger_avocat_bacon.jpg">
</body>
</html>