import java.sql.*;
import javax.swing.*;
public class Database {
	Connection conn=null;
	public static Connection getConnection()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SONI\\workspace\\LibraryDataBase.sqlite");
			//JOptionPane.showMessageDialog(null,"Connection Successfull");
			return conn;
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	
}
}
