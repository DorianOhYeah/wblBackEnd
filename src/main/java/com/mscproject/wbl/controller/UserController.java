package com.mscproject.wbl.controller;


import com.mscproject.wbl.domain.User;
import com.mscproject.wbl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//confirm it is the controller and return json
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public BaseResponse add(@RequestParam("name")String name, int id, @RequestParam("company")String company, @RequestParam("telphone")int telphone, @RequestParam("password")String password, @RequestParam("eamil")String email) {
        BaseResponse baseResponse = new BaseResponse<>();
        String ids = "" + id;
        if (ids == "") {
            baseResponse.setSuccess(false);
            baseResponse.setMessage("please enter id");
            return baseResponse;
        }
        if (password == null) {
            baseResponse.setSuccess(false);
            baseResponse.setMessage("please enter the password");
            return baseResponse;
        }
        User u = userService.get(id);
        if (u != null) {
            baseResponse.setSuccess(false);
            baseResponse.setMessage("the id has been registered");
        } else {
            try {
                userService.add(name, id, company, telphone, password, email);
                baseResponse.setSuccess(true);
                baseResponse.setMessage("register successfully");
            } catch (Exception e) {
                e.printStackTrace();
                baseResponse.setSuccess(false);
                baseResponse.setMessage("register failed");
            }
        }

        return baseResponse;
    }

    /**
     * @RequestMapping("/del") public String del(int id){
     * userService.del(id);
     * return "delete success";
     * }
     **/
    /**
     * @RequestMapping(value = "/update.do", method = RequestMethod.POST)
     * public String upd(String name, int id, String company, int telphone, String password, String email) {
     * User user = new User();
     * user.setName(name);
     * user.setCompany(company);
     * user.setEmail(email);
     * user.setPassword(password);
     * user.setTelphone(telphone);
     * userService.upd(user);
     * return "update success";
     * }
     **/


    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public BaseResponse<User> login(@RequestParam("id")int id, @RequestParam("password")String password) {
        BaseResponse<User> baseResponse = new BaseResponse<>();
        try {
            User user = userService.get(id);
            if (user == null) {
                baseResponse.setSuccess(false);
                baseResponse.setMessage("wrong id");
            } else {
                if (user.getPassword().equals(password)!=true) {
                    baseResponse.setSuccess(false);
                    baseResponse.setMessage("wrong password");
                } else {
                    System.out.println(user.getPassword()+"   "+password);
                        if (user != null) {
                            baseResponse.setData(user);
                            baseResponse.setSuccess(true);
                            baseResponse.setMessage("request successfully");
                        } else {
                            baseResponse.setSuccess(false);
                            baseResponse.setMessage("request failed");
                        }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            baseResponse.setSuccess(false);
            baseResponse.setMessage("something error");
        }
        return baseResponse;
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
public User get(@RequestParam("id")int id) {
    return userService.get(id);
}

}
