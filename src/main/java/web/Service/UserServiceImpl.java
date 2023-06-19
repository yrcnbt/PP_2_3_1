package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao ud;

    @Override
    public void addUser(User user) {
        ud.addUser(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        ud.updateUser(id, user);
    }

    @Override
    public void removeUser(User user) {
        ud.removeUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return ud.getUserById(id);
    }

    @Override
    public List<User> getListUser() {
        return ud.getListUser();
    }

    @Autowired
    public void setUd(UserDao ud) {
        this.ud = ud;
    }
}
