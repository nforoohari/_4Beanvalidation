<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .error{color: red}
    </style>
</head>
<body>


<form:form action="processForm" modelAttribute="product" method="post">
    <form:hidden path="id"/>

    <table>
        <tbody>
        <tr>
            <td><label>Name:</label></td>
            <td><form:input path="name"/></td>
        </tr>
        <form:errors path="name" cssClass="error"/>

        <tr>
            <td><label>Price:</label></td>
            <td><form:input path="price"/></td>
        </tr>
        <form:errors path="price" cssClass="error"/>



        <tr>
            <td><label>regx:</label></td>
            <td><form:input path="regX"/></td>
        </tr>
        <form:errors path="regX" cssClass="error"/>


        <tr>
            <td><label>couponCode:</label></td>
            <td><form:input path="couponCode"/></td>
        </tr>
        <form:errors path="couponCode" cssClass="error"/>
        <tr>
            <td><label></label></td>
            <td><input type="submit" value="Save Product"></td>
        </tr>



       <%-- <tr>
            <td><label>Description:</label></td>
            <td><form:input path="description"/></td>
        </tr>
        <tr>
            <td><label>Price:</label></td>
            <td><form:input path="price"/></td>
        </tr>
       --%>
        </tbody>
    </table>
</form:form>
</body>
</html>
