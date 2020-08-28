package cn.edu.guet.service.impl;

import cn.edu.guet.exception.SaveException;
import cn.edu.guet.mapper.RoleMapper;
import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.SQLIntegrityConstraintViolationException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleMapper roleMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    @Transactional()
    public void saveUser(User user) throws SaveException {
        /*
        为什么事务的边界要提升到业务层
         */
        try{
            userMapper.saveUser(user);
            roleMapper.insertRole(user.getId(),user.getRoles().get(0).getRoleId());
        }
        catch(Exception e){
            e.printStackTrace();
            throw new SaveException("添加用户失败");
        }
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }
}