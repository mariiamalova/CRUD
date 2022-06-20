package web.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAOImpl;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = new UserDAOImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
    userDao.addUser(user);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
    userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void removeUser(int id) {
    userDao.removeUser(id);
    }

    @Override
    public User getUserById(int id) {
       return userDao.getUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
