package com.mscproject.wbl.dao;

import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {

    @Select("SELECT * FROM student WHERE studentid=#{id}")
    Student get(int id);

    @Select("SELECT * FROM student")
    List<Student> list();
}
