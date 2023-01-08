package com.example.facturacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Conexion {
    private static Connection cn;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://35.247.221.55:3306/Ventas", "root","BioEvolt#4e");
            stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Cliente");
            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
            if (stmt.execute("SELECT * FROM Cliente")) {
            rs = stmt.getResultSet();
            
            }
		} catch (Exception e) {
			cn = null;
		}
		return cn;
	}
    

	public static void main(String[] args) throws SQLException {
        
		Connection pruebaCn = Conexion.getConnection();
		if(pruebaCn != null) {
			System.out.println("Conectado");
			System.out.println(pruebaCn);
            ResultSetMetaData rsm = rs.getMetaData();
            int columNumber = rsm.getColumnCount();
            while(rs.next()){
                for(int i=1;i<= columNumber;i++){
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsm.getColumnName(i));
                }
                
            }
            
		} else {
			System.out.println("Desconectado");
		}
	}
}
