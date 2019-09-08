package com.mscproject.wbl.controller;


import com.mscproject.wbl.domain.Assignment;
import com.mscproject.wbl.domain.Competency;
import com.mscproject.wbl.service.AssignmentService;
import com.mscproject.wbl.service.CompetencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//confirm it is the controller and return json
@RestController
@RequestMapping("/competency")
@ResponseBody
public class CompetencyController {
    @Autowired
    private CompetencyService competencyService;


@RequestMapping(value = "/list.do", method = RequestMethod.GET)
public List<Competency> get() {
    return competencyService.list();
}

    @RequestMapping(value = "/upd.do", method = RequestMethod.GET)
    public String upd(int studentid,int status,int assignmentid,int cid){
    Competency competency = new Competency();
    competency.setAssignmentid(assignmentid);
    competency.setStatus(status);
    competency.setStudentid(studentid);
        competency.setCid(cid);
    competencyService.upd(competency);
        return "successfully";
    }

    @RequestMapping(value = "/add.do", method = RequestMethod.GET)
    public String add(int studentid,int status,int assignmentid,int cid){
        Competency competency = new Competency();
        competency.setAssignmentid(assignmentid);
        competency.setStatus(status);
        competency.setStudentid(studentid);
        competency.setCid(cid);
        competencyService.add(competency);
        return "successfully";
    }
}
