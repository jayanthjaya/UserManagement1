package dao;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import connectionManager.ConnectionManager;
	import model.User;
	
	public class UserDAO {


	public boolean validate(User User) throws ClassNotFoundException, SQLException {
			
			String username = User.getUsername();
			String password = User.getPassword();
			ConnectionManager conn = new ConnectionManager();
			Connection con =	conn.establishConnection();
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select username, password from UserManagement4");
			
			while (rs.next()) {
				if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")))
				{
					conn.closeConnection();
					return true;
				}
				}
			conn.closeConnection();
			return false;
}

}
