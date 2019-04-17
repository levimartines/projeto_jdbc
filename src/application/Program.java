package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
	/*	dar comando SET @@global.time_zone = '+3:00'
		caso de erro de fuso-horário	*/
		
		Connection conn = DB.getConnection();	
		
		DB.closeConnection();
	}
}