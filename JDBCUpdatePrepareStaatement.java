package JDBCPackage;




	import java.sql.Connection;
	import java.sql.DriverManager;
     import java.sql.PreparedStatement;
    import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


	public class JDBCUpdatePrepareStaatement {
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
					
					
					String sql1="UPDATE book set title=?,author=? where book_id=?";
					PreparedStatement pstmt=conn1.prepareStatement(sql1);
					//pstmt.setInt(1,3);//already exists
					pstmt.setString(1,"sql");//Updating title
					pstmt.setString(2,"Sri");//Updating author
					pstmt.setInt(3,2);//updating book_Id
					int r=pstmt.executeUpdate();//dml-excuteUpdate()
					if(r>0)
						System.out.println("Row is Updated");
					else
						System.out.println("Row is not Updated");
					
					
					
					
					
					
					
					//2.create a statement(conn1)
					Statement stmt=conn1.createStatement();
					
					
					//UPDATE a query 
					String sql="UPDATE book set author='Sharuk' where book_Id=1";
					String srk="UPDATE book set price=1000 where book_Id=2";
					stmt.executeUpdate(sql);//dml
					stmt.executeUpdate(srk);
					//3 Execute a Query
					ResultSet rs=stmt.executeQuery(query);
					while(rs.next()) {
						//Displaying the values
						System.out.println("ID: "+rs.getInt("book_id"));
						System.out.println("TITLENAME: "+rs.getString("title"));
						System.out.println("AUTHORNAME: "+rs.getString("author"));
						System.out.println("PRICEAMOUNT: "+rs.getInt("price"));
					}
					rs.close();
				}
				
				
				catch(SQLException ex)
				{
					System.out.println(ex);
				}
				
				

}

}