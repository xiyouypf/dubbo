package com.ypf.dubbo.service;

import com.ypf.pojo.Emp;

import java.util.List;

public interface EmpDubboService {
    int insertEmp(Emp emp);

    List<Emp> findEmpByDeptId(Integer did);
}
