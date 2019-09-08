package com.mscproject.wbl.service;
import com.mscproject.wbl.domain.Competency;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.Submission;

import java.util.List;

public interface SubmissionService {
    List<Submission> list();
    void upd(Submission submission);
    void add(Submission submission);
}
