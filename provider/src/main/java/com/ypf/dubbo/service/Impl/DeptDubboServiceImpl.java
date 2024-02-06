package com.ypf.dubbo.service.Impl;

import com.ypf.dubbo.service.DeptDubboService;
//import com.ypf.mapper.DeptMapper;
import com.ypf.pojo.Dept;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DeptDubboServiceImpl implements DeptDubboService {
    @Override
    public List<Dept> selectAll() {
        return null;
    }
//    @Autowired
//    private DeptMapper deptMapper;
//
//    @Override
//    public List<Dept> selectAll() {
//        return deptMapper.findAll();
//    }
}
