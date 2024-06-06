package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User readUserID(long id);

    List<User> readUsers();

    void updateUser(User user);

    void deleteUser(long id);
}
