package project3;
import java.sql.*;
import java.sql.Connection;  
public class Connection3{  
public static void main(String[] args){  
	Connection con = null;
	Statement stmt  = null;
	ResultSet rs    = null;
try{  
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://192.168.0.131:3306/mydb14","kosea14","12345");  
System.out.println("데이터베이스에 접속했습니다.");
String query = "SELECT * FROM goodsinfo WHERE maker = '삼성'";
stmt = con.createStatement();
rs   = stmt.executeQuery(query);
while(rs.next())  {
	String goods_code = rs.getString(1);
	String goods_name = rs.getString(2);
	String price      = rs.getString(3);
	String maker      = rs.getString(4);
	System.out.printf("%-8s %s \t%5s  %-6s%n"
	          ,goods_code
	          ,goods_name
	          ,price
	          ,maker);
 
}
con.close();
}catch (ClassNotFoundException e) {
	System.out.println("해당 클래스를 찾을 수없습니다.");
	e.printStackTrace();
	//e.getMessage();
}catch (SQLException sqle) {
	sqle.printStackTrace();
}
finally {
	try {
		stmt.close();
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	try {
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
  }
 }
}





