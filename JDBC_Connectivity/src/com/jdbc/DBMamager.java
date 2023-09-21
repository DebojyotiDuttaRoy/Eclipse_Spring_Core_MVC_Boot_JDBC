package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import statement . .
//load driver ==== Patrol
//Create Connection ==== Keys and Kick
//Create Statements ==== Gear Change
//Execute statement ==== race with clutch release
//Show result ==== Reach place
//Close Connection ==== Stop Engine (Bike)
public class DBMamager {
	@SuppressWarnings("unused")
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbtest";
	private String uid = "root";
	private String passwd = "";
	
		public void selectRecords() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uid, passwd);
				Statement stmt = con.createStatement();
				ResultSet result = stmt.executeQuery("select * from tbl_student");			
				while(result.next()) {
					System.out.println("SID = "+result.getInt(1));
					System.out.println("Student Name = "+result.getString(2));
					System.out.println("Student RollNo = "+result.getInt(3));
					System.out.println("Student Marks = "+result.getFloat(4));
					System.out.println("=================");
				}
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		//insertion, updation, deletion
		public boolean RecordsManipulation(String query) {
			boolean flag = false;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uid, passwd);
				Statement stmt = con.createStatement();
				flag = stmt.executeUpdate(query)>0	? true : false;	
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
			return flag;
		}
}
