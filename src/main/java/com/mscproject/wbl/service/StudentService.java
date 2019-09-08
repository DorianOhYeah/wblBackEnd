package com.mscproject.wbl.service;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.User;

import java.util.List;

public interface StudentService {
    Student get(int id);
    List<Student> list();
}
