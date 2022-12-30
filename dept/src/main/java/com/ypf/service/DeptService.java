package com.ypf.service;

import com.ypf.pojo.Dept;
import com.ypf.pojo.Emp;

import java.util.List;

public interface DeptService {
    List<Dept> showAll();

    List<Emp> findEmpByDetpId(Integer did);
}
