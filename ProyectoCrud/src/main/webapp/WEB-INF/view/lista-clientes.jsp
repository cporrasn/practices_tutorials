<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hemos llegado a la lista de futuroa clientes

<table>

	<tr>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>email</th>
		<th>Modificar</th>
		<th>Eliminar</th>
	</tr>
	<c:forEach var="clientesTemp" items="${clientes }">
	
	<c:url var="linkActualizar" value="/cliente/muestraFormularioActualizar"> 
	
	<c:param name="clienteId" value="${clientesTemp.id}"></c:param>
	</c:url>
	
	<c:url var="linkEliminar" value="/cliente/eliminar"> 
	
	<c:param name="clienteId" value="${clientesTemp.id}"></c:param>
	</c:url>
	<tr>
		<th>${clientesTemp.nombre}</th>
		<th>${clientesTemp.apellido}</th>
		<th>${clientesTemp.email}</th>
		<th><a href="${linkActualizar}"><input type="button" value="Modificar" /></a></th>
		<th><a href="${linkEliminar}"><input type="button" value="Eliminar" 
		onclick="if(!(corfirm('Vas a eliminar. ¿Estás seguro?'))) return false"/></a></th>
	
	</tr>
	
	</c:forEach>
	

</table>

<input type="button" value="Agregar Cliente" onclick="window.location.href='muestraFormularioAgregar';return false;">

</body>
</html>