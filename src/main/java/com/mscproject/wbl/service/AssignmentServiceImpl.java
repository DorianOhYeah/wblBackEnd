package com.mscproject.wbl.service;

import com.mscproject.wbl.dao.AssignmentDao;
import com.mscproject.wbl.dao.StudentDao;
import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AssignmentServiceImpl implements AssignmentService {
    @Autowired
    AssignmentDao assignmentDao;

    @Override
    public List<Assignment> list() {
        return assignmentDao.list();
    }
}
