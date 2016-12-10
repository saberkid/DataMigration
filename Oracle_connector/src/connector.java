import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {
	public static String dburl="jdbc:oracle:thin:@localhost:1521:orcl";
	public static String user="system";
	public static String pwd="Liubin275288";
	
	public static Connection con=null;
	public static Statement st=null;
	public static ResultSet rs=null;
	
	public static void Connect() throws SQLException
	{
		con=DriverManager.getConnection(dburl, user, pwd);
		st=con.createStatement();
		
		String sql="select * from YSP";
		rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			String id=rs.getString("OBJ_ID");
			System.out.println(id);
		}
	}
	
	public static void main(String args[]) throws SQLException
	{
		Connect();
	}
}
