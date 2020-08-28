package cn.edu.guet.service;

import cn.edu.guet.exception.SaveException;
import cn.edu.guet.model.User;

public interface IUserService {

    User login(String username, String password);
    void saveUser(User user) throws SaveException;
    User getUserById(String userId);
}
