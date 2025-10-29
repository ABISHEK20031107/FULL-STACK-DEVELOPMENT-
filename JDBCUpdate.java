package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	    static final String DB_URL="jdbc:mysql://localhost:3306/abi";//db-dbname
		static final String USER="root";
		static final String PASS="Abishek@2003";
		
		static Connection conn1=null;
		//fetch the data
		static  final String query="select * from book ";
		
		public static void main(String[] args) {
			//Open a collection
			try {
				//1.Connection to DB
				conn1=DriverManager.getConnection(DB_URL,USER,PASS);
				//2.create a statement(conn1)
				Statement stmt=conn1.createStatement();
				//3 Execute a Query
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					//Displaying the values
					System.out.println("ID"+rs.getInt("book_id"));
					System.out.println("TITLENAME"+rs.getString("title"));
					System.out.println("AUTHORNAME"+rs.getString("author"));
					System.out.println("PRICEAMOUNT"+rs.getInt("price"));
				}
				rs.close();
			}
			
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
	}
}