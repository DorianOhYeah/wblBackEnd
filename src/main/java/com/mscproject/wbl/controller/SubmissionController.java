package com.mscproject.wbl.controller;


import com.mscproject.wbl.domain.Competency;
import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.Submission;
import com.mscproject.wbl.service.StudentService;
import com.mscproject.wbl.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//confirm it is the controller and return json
@RestController
@RequestMapping("/submission")
@ResponseBody
public class SubmissionController {
    @Autowired
    private SubmissionService submissionService;


    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public List<Submission> get() {
        return submissionService.list();
    }


    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public String add(int studentID, String title, String path, int status, int assignmentID, String submissiondata, @RequestBody String comment) {
        Submission submission = new Submission();
        submission.setAssignmentID(assignmentID);
        submission.setComment(comment);
        submission.setPath(path);
        submission.setStatus(status);
        submission.setStudentID(studentID);
        submission.setTitle(title);
        submission.setSubmissiondata(submissiondata);
        submissionService.add(submission);
        return "successfully";
    }

    @RequestMapping(value = "/upd.do", method = RequestMethod.POST)
    public String upd(int studentID, String title, String path, int status, int assignmentID, String submissiondata, @RequestBody String comment) {
        Submission submission = new Submission();
        submission.setAssignmentID(assignmentID);
        submission.setComment(comment);
        submission.setPath(path);
        submission.setStatus(status);
        submission.setStudentID(studentID);
        submission.setTitle(title);
        submission.setSubmissiondata(submissiondata);
        submissionService.upd(submission);
        return "successfully";
    }

}
