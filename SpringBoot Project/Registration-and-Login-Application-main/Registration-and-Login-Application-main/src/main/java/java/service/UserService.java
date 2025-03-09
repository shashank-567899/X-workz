package java.service;

import java.dto.UserDto;
import java.model.User;

public interface UserService {

	User findByUsername(String username);

	User save(UserDto userDto);

	User save(User user);

}
