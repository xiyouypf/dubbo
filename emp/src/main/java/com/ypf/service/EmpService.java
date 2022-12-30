package com.ypf.service;

import com.ypf.pojo.Dept;
import com.ypf.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EmpService {
    List<Dept> showAll();

    int insert(Emp emp, MultipartFile file);
}
