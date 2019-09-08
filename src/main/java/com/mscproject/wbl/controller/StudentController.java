package com.mscproject.wbl.controller;


import com.mscproject.wbl.domain.Student;
import com.mscproject.wbl.domain.User;
import com.mscproject.wbl.service.StudentService;
import com.mscproject.wbl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//confirm it is the controller and return json
@RestController
@RequestMapping("/student")
@ResponseBody
public class StudentController {
    @Autowired
    private StudentService studentService;



    @RequestMapping(value = "/get.do", method = RequestMethod.GET)
    public Student login(@RequestParam("id")int id) {
        return studentService.get(id);
    }
/**
 @RequestMapping(value = "/info.do", method = RequestMethod.GET)
 public BaseResponse<User> list() {
 BaseResponse<User> baseResponse = new BaseResponse<>();
 List<User> list = userService.list();
 baseResponse.setData(list);
 baseResponse.setSuccess(true);
 baseResponse.setMessage("request successfully");
 return baseResponse;
 }
 **/

@RequestMapping(value = "/list.do", method = RequestMethod.GET)
public List<Student> get() {
    return studentService.list();
}



}
