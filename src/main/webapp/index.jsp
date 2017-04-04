<%@page import="it.polito.ai.es02.model.BusLine"%>
<%@page import="java.util.List"%>
<%@page import="it.polito.ai.es02.services.LinesService"%>
<%@page import="it.polito.ai.es02.listeners.AppListener"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%

	List<BusLine> busLineList = null;

	LinesService linesService = (LinesService) request.getServletContext()
	.getAttribute(AppListener.CONTEXT_ATTRIBUTE_LINES_SERVICE);
	
	if(linesService != null){
		busLineList = linesService.getLines();
	}
	
%>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bus WebApp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
  <h1>Bus WebApp</h1> 
</div>
  
<div class="container">
  <h1>GTT Lines</h1>
  <table class="table table-striped">
  	<thead>
  		<tr>
  			<th>Name</th>
  			<th>Description</th>
  		</tr>
  	</thead>
  	<tbody>
  		<%
			for(BusLine busLine: busLineList){
		%>
			<tr>
				<td><%=busLine.getLine() %></td>
				<td><%=busLine.getDescription() %></td>
			</tr>
		<% 	
			}
  		%>
  	</tbody>
  </table>
</div>

</body>
</html>
