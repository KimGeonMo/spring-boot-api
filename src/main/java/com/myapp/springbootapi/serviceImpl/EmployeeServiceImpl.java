package com.myapp.springbootapi.serviceImpl;

import com.myapp.springbootapi.mapper.EmployeeMapper;
import com.myapp.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final int VIEW_EMPLOYEE_SIZE = 3;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String test() {
        return employeeMapper.dbAccess();
    }

    @Override
    public Map<String, Object> list(int pageNo) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            result.put("totalCount", employeeMapper.totalCnt());
            result.put("employeeList", employeeMapper.getList(pageNo, VIEW_EMPLOYEE_SIZE));
        } catch(Exception e) {
            result = new HashMap<String, Object>();
            e.printStackTrace();
        }

        return result;
    }
}
