package com.ypf.service.impl;

import com.ypf.dubbo.service.DeptDubboService;
import com.ypf.dubbo.service.EmpDubboService;
import com.ypf.pojo.Dept;
import com.ypf.pojo.Emp;
import com.ypf.service.EmpService;
import org.apache.commons.logging.Log;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class EmpServiceImpl implements EmpService {

    @Reference
    private DeptDubboService deptDubboService;
    @Reference
    private EmpDubboService empDubboService;

    @Override
    public List<Dept> showAll() {
        return deptDubboService.selectAll();
    }

    @Override
    public int insert(Emp emp, MultipartFile file) {
        //通过Spring容器获取HttpServletRequest对象
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //通过HttpServletRequest对象，获取图片上传的路径
        String path = request.getServletContext().getRealPath("/img");
        System.out.println("path = " + path);

        long currentTimeMills = System.currentTimeMillis();
        Random random = new Random();

        String fileName = currentTimeMills + "" + random.nextInt(1000);
        String oldName = file.getOriginalFilename();
        fileName += oldName.substring(oldName.lastIndexOf("."));

        File pathFile = new File(path);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }

        //图片上传
        try {
            file.transferTo(new File(path, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        emp.setPhoto("http://localhost:8081/img/" + fileName);
        return empDubboService.insertEmp(emp);
    }
}
