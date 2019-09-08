package com.mscproject.wbl.service;
import com.mscproject.wbl.domain.User;

import java.util.List;

public interface UserService {
    void add(String name,int id,String company,int telphone,String password,String email);
    void del(int id);
    void upd(User user);
    User get(int id);
    List<User> list();
}
