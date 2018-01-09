import java.sql.*;
public class LibrarianDao {
	
	public static int save(String names,String passwords,String emails,String addresss,String citys,String contact)
	{
		int status=0;
		try{
			Connection con=Database.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into librarian(name,password,email,address,city,contact) values(?,?,?,?,?,?)");
			ps.setString(1,names);
			ps.setString(2,passwords);
			ps.setString(3,emails);
			ps.setString(4,addresss);
			ps.setString(5,citys);
			ps.setString(6,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=Database.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=Database.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
			}
		return status;
	}
	
}
