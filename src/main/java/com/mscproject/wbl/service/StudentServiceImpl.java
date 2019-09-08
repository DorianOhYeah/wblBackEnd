package com.mscproject.wbl.service;

import com.mscproject.wbl.dao.StudentDao;
import com.mscproject.wbl.dao.UserDao;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao StudentDao;

    @Override
    public Student get(int id) {
        return StudentDao.get(id);
    }

    @Override
    public List<Student> list() {
        return StudentDao.list();
    }
}
