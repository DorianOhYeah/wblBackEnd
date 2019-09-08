package com.mscproject.wbl.dao;

import com.mscproject.wbl.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Insert("INSERT INTO info_user(id,name,company,telphone,password,email) VALUES(#{id},#{name},#{company},#{telphone},#{password},#{email})")
    void add(String name,int id,String company,int telphone,String password,String email);

    @Delete("DELETE FROM info_user WHERE id=#{id}")
    void del(int id);

    @Update("UPDATE info_user SET name=#{name},company=#{company},telephone=#{telphone},password=#{password},email=#{email} WHERE id=#{id}")
    void upd(User user);

    @Select("SELECT * FROM info_user WHERE id=#{id}")
    User get(int id);

    @Select("SELECT * FROM info_user")
    List<User> list();
}
