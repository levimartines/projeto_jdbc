package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	public static void main(String[] args) {

		Connection conn = null;
		//Statemente = intarface usada para executar SQL
		Statement st = null;
		//tabela resultado
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();	

			rs = st.executeQuery("SELECT * FROM department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatemente(st);
			DB.closeConnection();
		}
		
	}
}