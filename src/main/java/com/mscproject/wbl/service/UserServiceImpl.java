package com.mscproject.wbl.service;

import com.mscproject.wbl.dao.UserDao;
import com.mscproject.wbl.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserDao userDao;
    @Override
    public void add(String name,int id,String company,int telphone,String password,String email) {
        userDao.add(name,id,company,telphone,password,email);
    }

    @Override
    public void del(int id) {
        userDao.del(id);
    }

    @Override
    public void upd(User user) {
        userDao.upd(user);
    }

    @Override
    public User get(int id) {
        return userDao.get(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
