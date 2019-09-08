package com.mscproject.wbl.controller;


import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Submission;
import com.mscproject.wbl.service.AssignmentService;
import com.mscproject.wbl.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//confirm it is the controller and return json
@RestController
@RequestMapping("/assignment")
@ResponseBody
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;


@RequestMapping(value = "/list.do", method = RequestMethod.GET)
public List<Assignment> get() {
    return assignmentService.list();
}

}
