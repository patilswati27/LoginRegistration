package services;

import model.Login;
import model.User;

public interface UserService {
	public void register(User user);

	public User validateUser(Login login);
}
