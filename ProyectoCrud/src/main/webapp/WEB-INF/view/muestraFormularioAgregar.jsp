<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="insertarCliente" modelAttribute="cliente" method="POST">
      <table>
      <form:hidden path="id"/>
          <tr>
              <td>Nombre:</td>
              <td><form:input path="nombre" /> 
          </tr>
          <tr>
              <td>Apellido:</td>
              <td><form:input path="apellido" /></td>
          </tr>
          <tr>
              <td>Email</td>
              <td><form:input path="email" /> 
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Insertar" />
              </td>
          </tr>
      </table>
  </form:form>

</body>
</html>