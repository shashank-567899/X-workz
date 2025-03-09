package loginpage.service;

import loginpage.dto.UserDto;
import loginpage.model.User;

public interface UserService {

	User findByUsername(String username);

	User save(UserDto userDto);

	User save(User user);

}
