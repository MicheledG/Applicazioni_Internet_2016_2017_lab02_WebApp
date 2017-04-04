<%@page import="it.polito.ai.es02.listeners.AppListener"%>
<%@page import="it.polito.ai.es02.services.LinesService"%>
<%@page import="it.polito.ai.es02.model.BusStop"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	
	List<BusStop> busStopList = null;
	
	LinesService linesService = (LinesService) request.getServletContext()
	.getAttribute(AppListener.CONTEXT_ATTRIBUTE_LINES_SERVICE);
	
	if(linesService != null){
		busStopList = linesService.getLineStop(null);
	}
	

%>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
  <h1>GTT stops</h1>
  <table class="table table-striped">
  	<thead>
  		<tr>
  			<th>Id</th>
  			<th>Name</th>
  		</tr>
  	</thead>
  	<tbody>
  		<%
			for(BusStop busStop: busStopList){
			String id = busStop.getId();
			String name = busStop.getName();
		%>
			<tr>
				<td><%=id %></td>
				<td><%=name %></td>
			</tr>
		<% 	
			}
  		%>
  	</tbody>
  </table>
</div>  


</body>
</html>
