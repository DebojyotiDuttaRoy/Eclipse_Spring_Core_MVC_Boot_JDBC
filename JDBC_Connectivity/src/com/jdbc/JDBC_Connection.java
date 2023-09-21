package com.jdbc;

public class JDBC_Connection {

	public static void main(String[] args) {
		//new DBMamager().selectRecords();
		BussLayer buss = new BussLayer();
		buss.selectData();
/*		buss.insertData(11, "Ravi", 4009, 345.0f);
		buss.selectData();
		buss.updateData(11, 372.0f);
		buss.selectData();
		buss.deleteData(22);
		buss.selectData();		*/
	}
}
