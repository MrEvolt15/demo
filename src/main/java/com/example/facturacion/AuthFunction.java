package com.example.facturacion;
import java.io.BufferedWriter;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthFunction implements HttpFunction{
    private static Connection cn;
    static Statement stmt = null;
    static ResultSet rs = null;
    static String errmsg;
    static int cid;

    @Override
    public void service(HttpRequest request, HttpResponse response) throws SQLException {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://35.247.221.55:3306/mydb", "root","BioEvolt#4e");
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT C_password FROM Cliente WHERE C_id= 1");
            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
            if (stmt.execute("SELECT C_password FROM Cliente WHERE C_id= 1")) {
                rs = stmt.getResultSet();
                final BufferedWriter writer = response.getWriter();
                writer.write("true");
            }
        } catch (Exception e) {
			cn = null;
            errmsg = e.getMessage();
		}
        
    }
    
}
