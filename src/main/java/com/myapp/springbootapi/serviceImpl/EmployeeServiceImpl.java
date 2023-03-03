package com.myapp.springbootapi.serviceImpl;

import com.myapp.springbootapi.mapper.EmployeeMapper;
import com.myapp.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String test() {
        return employeeMapper.dbAccess();
    }

    @Override
    public Map<String, Object> list(int pageNo, int pageLimit) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            result.put("totalCount", employeeMapper.totalCnt());
            result.put("employeeList", employeeMapper.getList(pageNo, pageLimit));
        } catch(Exception e) {
            result = new HashMap<String, Object>();
            e.printStackTrace();
        }

        return result;
    }
}
