package project3;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Connection {
	
	public static void main(String args[]) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rest = null;
		String url = "DB의 URL";
		String query = null;
		
		Class.forName("core.log.jdbc.driver.MysqlDriver");
		conn = DriverManager.getConnection
		("jdbc:mysql://192.168.0.131:3306/mydb14","kosea14","12345");
		System.out.println("데이터 베이스에 접속 했습니다");
		
		stmt = conn.createStatement();
		
		rest = stmt.executeQuery("SELECT * FROM goodsinfo");
		
		query = "쿼리문...ex)ID를 찾는 쿼리문";
		rest = stmt.executeQuery(query.toString());
		
		while(rest.next()){
			System.out.println(rest.getString("ID"));
		}
		
		rest.close();
		stmt.close();
		conn.close();
	}
}

