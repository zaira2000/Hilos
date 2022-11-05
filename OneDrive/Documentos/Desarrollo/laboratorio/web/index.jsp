<%-- 
    Document   : index
    Created on : 4/11/2022, 8:02:56 p. m.
    Author     : zaira
--%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Usuarios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>     
        <%
            Conexion = null;
            Statement st = null;
            ResultSet rs = null;
        %>
        <div class="container">
            <nav class="navbar bg-light">
                <div class="container-fluid">
                </div>
            </nav>
            <div class="row mt-2">
                <div class="col-sm">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellido</th>
                                <th scope="col">Apodo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    con = (Conexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/toxica?user=root&password=");
                                    st = con.createStatement();
                                    rs = st.executeQuery("SELECT * FROM `persona`;");
                                    while (rs.next()) {
                            %>
                            <tr>
                                <th scope="row"><%= rs.getString(1)%></th>
                                <td><%= rs.getString(2)%></td>
                                <td><%= rs.getString(3)%></td>
                                <td><%= rs.getString(4)%></td>
                            </tr>

                            <%
                                }
                                } catch (Exception e) {
                                    out.print("ERROR MySQL" + e);
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>

