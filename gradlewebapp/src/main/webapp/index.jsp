<%
	System.out.println("index.jsp wird geliefert");
%>
<htmtl>
<body>
<pre style="font-size: 30pt;"><%=com.github.ricksbrown.cowsay.Cowsay.say(new String[] { "Hello Gradle Web App!" })%></pre>
</body>
</html>
