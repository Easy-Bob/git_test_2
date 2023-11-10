<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2023/11/8
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter Controller</title>
</head>
<body>
<h3>8. get Object->List Type</h3>
<form action="test09" method="post">
  Team Id1:<input name="teamList[0].teamId"/> <br>
  Team Id2:<input name="teamList[0].teamId"/> <br>
  Team Id3:<input name="teamList[0].teamId"/> <br>
  Team Name1:<input name="teamList[0].teamName"/> <br>
  Team Name2:<input name="teamList[1].teamName"/> <br>
  Team Name3:<input name="teamList[2].teamName"/> <br>
  <button type="submit">Submit</button>
</form>

<h3>8. get List Type</h3>
<form action="test08" method="post">
  Team Name1:<input name="teamName"/> <br>
  Team Name2:<input name="teamName"/> <br>
  Team Name3:<input name="teamName"/> <br>
  <button type="submit">Submit</button>
</form>

<h3>7. get Array Type</h3>
<form action="test07" method="post">
  Team Name1:<input name="teamName"/> <br>
  Team Name2:<input name="teamName"/> <br>
  Team Name3:<input name="teamName"/> <br>
  <button type="submit">Submit</button>
</form>


<h3>6. get Date</h3>
<form action="test06" method="post">
  Team ID:<input name="teamId"/> <br>
  Team Name:<input name="teamName"/> <br>
  Team Location:<input name="teamLocation"/> <br>
  Date:<input name="createDate" /> <br>
  <button type="submit">Submit</button>
</form>


<h3>5.using url to post parameters</h3>

<h3>4.using HttpServletRequest to accept parameters</h3>
<form action="test04" method="post">
  Team ID:<input name="teamId"/> <br>
  Team Name:<input name="teamName"/> <br>
  Team Location:<input name="teamLocation"/> <br>
  <button type="submit">Submit</button>
</form>

<h3>3.mismatched argument name posted and accepted  </h3>
<form action="test03" method="post">
  Team ID:<input name="Id"/> <br>
  Team Name:<input name="Name"/> <br>
  Team Location:<input name="Location"/> <br>
  <button type="submit">Submit</button>
</form>


<h3>2.accept multiple arguments using object</h3>
<form action="test02" method="post">
  Team ID:<input name="teamId"/> <br>
  Team Name:<input name="teamName"/> <br>
  Team Location:<input name="teamLocation"/> <br>
  <button type="submit">Submit</button>
</form>

  <h3>1.accept method parameter directly</h3>
  <form action="test01" method="post">
    Team ID:<input name="teamId"/> <br>
    Team Name:<input name="teamName"/> <br>
    Team Location:<input name="teamLocation"/> <br>
    <button type="submit">Submit</button>
  </form>
</body>
</html>
