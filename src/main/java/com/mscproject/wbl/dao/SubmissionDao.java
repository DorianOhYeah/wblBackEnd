package com.mscproject.wbl.dao;

import com.mscproject.wbl.domain.Competency;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.Submission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubmissionDao {

    @Select("SELECT * FROM submission")
    List<Submission> list();

    @Update("UPDATE submission SET  title = #{title},path=#{path}, status=#{status},assignmentid = #{assignmentID},submissiondata=#{submissiondata}, comment = #{comment} WHERE  studentid=#{studentID}")
    void upd(Submission submission);

    @Insert("INSERT INTO submission(title,path, status,assignmentid ,submissiondata, comment,studentid) VALUES(#{title},#{path}, #{status},#{assignmentID},#{submissiondata}, #{comment},#{studentID})")
    void add(Submission submission);
}
