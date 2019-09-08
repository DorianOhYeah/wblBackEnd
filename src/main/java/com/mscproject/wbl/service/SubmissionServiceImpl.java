package com.mscproject.wbl.service;

import com.mscproject.wbl.dao.StudentDao;
import com.mscproject.wbl.dao.SubmissionDao;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SubmissionServiceImpl implements SubmissionService {
    @Autowired
    SubmissionDao submissionDao;


    @Override
    public List<Submission> list() {
        return submissionDao.list();

    }
    @Override
    public void upd(Submission submission){
        submissionDao.upd(submission);
    };
    @Override
    public  void add(Submission submission){
        submissionDao.add(submission);
    };
}
