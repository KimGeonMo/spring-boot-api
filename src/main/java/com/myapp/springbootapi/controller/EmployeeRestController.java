package com.myapp.springbootapi.controller;

import com.myapp.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Controller Access Test
     * */
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    /**
     * DB Access Test
     * */
    @GetMapping("/test2")
    public String test2(){
        return employeeService.test();
    }

    /**
     * Employee List select
     * @param {int} pageNo
     * return Map
     * */
    @GetMapping("list")
    public Map<String, Object> list(@RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo) {
        return employeeService.list(pageNo);
    }

}
