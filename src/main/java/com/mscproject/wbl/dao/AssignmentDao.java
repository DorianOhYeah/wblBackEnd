package com.mscproject.wbl.dao;

import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AssignmentDao {


    @Select("SELECT * FROM assignment")
    List<Assignment> list();
}
