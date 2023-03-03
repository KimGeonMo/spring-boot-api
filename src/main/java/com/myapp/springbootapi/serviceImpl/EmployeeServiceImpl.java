package com.myapp.springbootapi.serviceImpl;

import com.myapp.springbootapi.mapper.EmployeeMapper;
import com.myapp.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String test() {
        return employeeMapper.dbAccess();
    }
}
