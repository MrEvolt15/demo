package com.example.facturacion;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.xdevapi.Statement; 

public class Conexion {
    private static Connection cn;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://35.247.221.55:3306/Ventas", "root", "BioEvolt#4e");
		} catch (Exception e) {
			cn = null;
		}
		return cn;
	}
	
	public static void main(String[] args) {
		Connection pruebaCn = Conexion.getConnection();
		if(pruebaCn != null) {
			System.out.println("Conectado");
			System.out.println(pruebaCn);
		} else {
			System.out.println("Desconectado");
		}
	}
}
