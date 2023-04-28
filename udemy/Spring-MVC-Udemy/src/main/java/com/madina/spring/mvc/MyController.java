package com.madina.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showView(){
        return "FirstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails(){
        return "show-emp-details-view";
    }
}
