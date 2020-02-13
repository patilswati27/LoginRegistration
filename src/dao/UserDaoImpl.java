package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Login;
import model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbctemplate;

	public int createtable() {
		String query = "CREATE TABLE User_details" + "(mobile varchar(60)," + "fname varchar(50),"
				+ "lname varchar(50)," + "email varchar(50)," + "address varchar(100)," + "username varchar(50),"
				+ "password varchar(50))";
		return jdbctemplate.update(query);
	}

	public void register(User user) {
		String sql = "Insert into User_details values(?,?,?,?,?,?,?)";
		jdbctemplate.update(sql, new Object[] { user.getMobile(), user.getFname(), user.getLname(), user.getAddress(),
				user.getUsername(), user.getPassword(), user.getEmail() });

	}

	@Override
	public User validateUser(Login login) {
		String sql = "Select * from user_details where username='" + login.getUsername() + " and password="
				+ login.getPassword() + ",";
		List<User> users = jdbctemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}

}
