<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "login" method = "get">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
         <input type = "submit" value = "Submit" />
      </form>
      
      <html>
   <form action = "conditionCheck" method = "get" target = "_blank">
         <input type = "checkbox" name = "maths" /> 18+
         <input type = "checkbox" name = "physics"  /> Ghi nhớ
         <input type = "submit" value = "Submit value" />
      </form>
</html>
</body>
</html>