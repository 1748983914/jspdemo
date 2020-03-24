package com.liwei.jspdemo.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwei.jspdemo.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author 邢立伟20165939
 * @create 2020/3/2 - 20:13
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
