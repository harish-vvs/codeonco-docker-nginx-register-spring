<%@ page contentType="text/html; charset=iso-8859-1" language="java"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>REST API for ordering service and items</title>
</head>
<body>
    <h1>Simple RESTfull APP for ordering service and items</h1>
    <h2>Host IP: <small><%= request.getLocalAddr() %></small></h2>

    <h2>Technology Used</h2>
    <ul>
        <li>Spring MVC</li>
        <li>Spring Data JPA</li>
        <li>Hibernate JPA Implementation</li>
    </ul>

    <h2>REST APIs:</h2>
    <ul>
        <li><code>GET /rest</code> Get all RestMeasure records from DB</li>
        <li><code>GET /rest/{id}</code> Get RestMeasure records from DB based on ID</li>
        <li><code>POST /rest</code> Create a RestMeasure record with given <code>serviceName</code>, <code>userName</code> parameter</li>
    </ul>
</body>
</html>
