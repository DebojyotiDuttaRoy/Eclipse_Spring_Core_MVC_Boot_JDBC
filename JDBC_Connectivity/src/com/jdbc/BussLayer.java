package com.jdbc;

public class BussLayer {
	private DBMamager db;
	public BussLayer() {
		db = new DBMamager();
	}
	public void selectData() {
		db.selectRecords();
	}
	public void insertData(int sid, String sname, int rollno, float marks) {
		String cmd = "insert into tbl_student (sid, sname, rollno, marks) values ('"+sid+"','"+sname+"','"+rollno+"','"+marks+"')";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been saved successfully");
		else
			System.out.println("Record has not been saved successfully");
	}
	public void updateData(int sid, float marks) {
		String cmd = "update tbl_student set marks='"+marks+"' where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been updated successfully");
		else
			System.out.println("Record has not been updated successfully");
	}
	public void deleteData(int sid) {
		String cmd = "delete from tbl_student where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been deleted successfully");
		else
			System.out.println("Record has not been deleted successfully");
	}
}
