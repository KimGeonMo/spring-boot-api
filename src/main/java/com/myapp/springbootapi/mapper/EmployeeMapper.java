package com.myapp.springbootapi.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public String dbAccess();
}
