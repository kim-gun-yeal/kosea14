package project3;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Connection {
	
	public static void main(String args[]) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rest = null;
		String url = "DB�� URL";
		String query = null;
		
		Class.forName("core.log.jdbc.driver.MysqlDriver");
		conn = DriverManager.getConnection
		("jdbc:mysql://192.168.0.131:3306/mydb14","kosea14","12345");
		System.out.println("������ ���̽��� ���� �߽��ϴ�");
		
		stmt = conn.createStatement();
		
		rest = stmt.executeQuery("SELECT * FROM goodsinfo");
		
		query = "������...ex)ID�� ã�� ������";
		rest = stmt.executeQuery(query.toString());
		
		while(rest.next()){
			System.out.println(rest.getString("ID"));
		}
		
		rest.close();
		stmt.close();
		conn.close();
	}
}

