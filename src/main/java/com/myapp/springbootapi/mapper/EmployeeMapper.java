package com.myapp.springbootapi.mapper;

import com.myapp.springbootapi.model.EmployeeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public String dbAccess();

    public int totalCnt();

    public List<EmployeeVO> getList(@Param("pageNo") int pageNo, @Param("size") int size);

}
