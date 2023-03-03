package com.myapp.springbootapi.service;

import java.util.Map;

public interface EmployeeService {

    public String test();

    public Map<String, Object> list(int pageNo);
}
