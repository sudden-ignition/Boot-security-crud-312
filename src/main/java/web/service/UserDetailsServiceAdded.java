package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserDetailsServiceAdded extends UserDetailsService {
    void addUser(User user);
    void updateUser(User user);
    void removeUserById(Long id);
    List<User> getAllUsers();
    User findById(Long id);
}
