package com.ypf.service.impl;

import com.ypf.dubbo.service.DeptDubboService;
import com.ypf.dubbo.service.EmpDubboService;
import com.ypf.pojo.Dept;
import com.ypf.pojo.Emp;
import com.ypf.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Reference
    private DeptDubboService deptDubboService;

    @Reference
    private EmpDubboService empDubboService;

    @Override
    public List<Dept> showAll() {
        return deptDubboService.selectAll();
    }

    @Override
    public List<Emp> findEmpByDetpId(Integer did) {
        return empDubboService.findEmpByDeptId(did);
    }
}
