package luna_DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import luna_Class.User;

public class UserDAOMysql implements UserDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public UserDAOMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users=new ArrayList<User>();
		User user=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM User");

			while (result.next()) {
				user=new User();
				user.setId(result.getInt("id"));
				user.setLogin(result.getString("login"));
				user.setPass(result.getString("pass"));
				user.setRole(result.getInt("role"));
				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getUser(int userID) {
		return null;
	}

	@Override
	public void insertUser(User user) {
	}


	public UserDAO login(String login, String password) {
		return null;
	}

	@Override
	public void removeUser(int userID) {
	}

	@Override
	public void updateUser(User user) {
	}
	
	@Override
	public   boolean getUserConnection(String user, String passwd){
		
		try 
		{
			state=conn.createStatement();
			ResultSet resultat= state.executeQuery("select login,role from user where login='"+user+"' and pass='"+passwd+"'");
			if(resultat.next()!=false)
			{
				return true;
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}

}