<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2023/11/9
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>RESULT</title>
    <script src="../js/jquery-1.11.1.js"></script>
</head>
<body>
<h1>===RESULT====</h1>
    <h2>test01-------- ${teamName}</h2>
<h2>test02----request:--${requestScope.team.teamId}-${requestScope.team.teamName}-${requestScope.team.teamLocation}</h2>
<h2>test02----session:--${sessionScope.team.teamId}-${sessionScope.team.teamName}-${sessionScope.team.teamLocation}</h2>

<div>
    <button type="button" id="btn1">ajax request for Custom Object</button>
    <h3>ajax POST result</h3>
    <p id="res"></p>
</div>
<script>
    $(function() {
        $("#btn1").click(
            function () {
                $.ajax({
                    type: "POST",
                    url: "/result/test03-4",
                    data: "",
                    success: function (list) {
                        // alert(msg);
                        var str="";
                        for(var i=0;i<list.length;i++){
                            var msg=list[i];
                            var name = msg.teamName;
                            var id = msg.teamId;
                            var location = msg.teamLocation;
                            str+="name:" + name + ",id:" + id + ",location:" + location+"<br>";
                        }
                        $("#res").html(str);
                    }
                });
            }
        );
    });
</script>

<div>
    <button type="button" id="btn2">ajax request for Custom Object</button>
    <h3>ajax POST result-MAP</h3>
    <p id="res2"></p>
</div>
<script>
    $(function() {
        $("#btn2").click(function () {
            $.ajax({
                type: "POST",
                url: "/result/test03-5",
                data: "",
                success: function (map) {
                    alert("Data Saved: " + map);
                    var str = "";
                    $.each(map, function (i, obj) {
                        str += "name:" + obj.teamName + ",id:" + obj.teamId + ",location:" + obj.teamLocation + "<br/>";
                    });
                    $("#res2").html(str);
                }
            });
        });
    });
</script>
</body>
</html>
