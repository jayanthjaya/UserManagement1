package dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import connectionManager.ConnectionManager;
	import model.Admin;



	public class AdminDAO {
		
		
		public void addAdmin(Admin admin) throws ClassNotFoundException, SQLException {
			
			int id = admin.getId();
			String username2 = admin.getUsername();
			String password2 = admin.getPassword();
			
			ConnectionManager conn = new ConnectionManager();
			Connection con = conn.establishConnection();
			String sql = "insert into UserManagement4(id,username,password)values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,id);
			ps.setString(2, username2);
			ps.setString(3, password2);
			ps.executeUpdate();
			conn.closeConnection();
	}

		public void update(Admin admin) throws ClassNotFoundException, SQLException {
		
			int id3 = admin.getId();
			int id4 = admin.getId();
			String username3 = admin.getUsername();
			String password3 = admin.getPassword();
			
			ConnectionManager conn = new ConnectionManager();
			Connection con = conn.establishConnection();
			String sql = "update  UserManagement4 set id=?, username=?, password=? where id=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,id3);
			ps.setString(2, username3);
			ps.setString(3, password3);
			ps.setInt(4, id4);
			ps.executeUpdate();
			conn.closeConnection();
			
		}

		public void delect(Admin admin) throws ClassNotFoundException, SQLException {
			
			int id = admin.getId();
			
			ConnectionManager conn = new ConnectionManager();
			Connection con = conn.establishConnection();
			String sql = "delete from UserManagement4 where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.executeUpdate();
			conn.closeConnection();
			
		}

		
			
		}
	
		

