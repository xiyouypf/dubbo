package com.ypf.dubbo.service.Impl;

import com.ypf.dubbo.service.EmpDubboService;
//import com.ypf.mapper.EmpMapper;
import com.ypf.pojo.Emp;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmpDubboServiceImpl implements EmpDubboService {
    @Override
    public int insertEmp(Emp emp) {
        return 0;
    }

    @Override
    public List<Emp> findEmpByDeptId(Integer did) {
        return null;
    }
//    @Autowired
//    private EmpMapper empMapper;
//
//    @Override
//    public int insertEmp(Emp emp) {
//        return empMapper.insertEmp(emp);
//    }
//
//    @Override
//    public List<Emp> findEmpByDeptId(Integer did) {
//        return empMapper.findEmpByDeptId(did);
//    }
}
