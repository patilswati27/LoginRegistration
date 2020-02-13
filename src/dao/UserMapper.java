package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	User user=new User();
	user.setUsername(rs.getString("username"));
	user.setPassword(rs.getString("password"));
	user.setFname(rs.getString("fname"));
	user.setLname(rs.getString("lname"));
	user.setAddress(rs.getString("address"));
	user.setAddress(rs.getString("email"));
	user.setMobile(rs.getString("mobile"));
		return user;
	}




}
