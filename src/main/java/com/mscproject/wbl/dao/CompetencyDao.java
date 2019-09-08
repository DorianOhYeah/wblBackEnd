package com.mscproject.wbl.dao;

import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Competency;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompetencyDao {


    @Select("SELECT * FROM competency")
    List<Competency> list();

    @Update("UPDATE competency SET status=#{status},assignmentid=#{assignmentid} WHERE  studentid=#{studentid}")
    void upd(Competency competency);

    @Insert("INSERT INTO competency(studentid,status,assignmentid,cid) VALUES(#{studentid},#{status},#{assignmentid} ,#{cid})")
    void add(Competency competency);}
