package com.ypf.controller;

import com.ypf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept")
    public String showDept(Model model) {
        model.addAttribute("list", deptService.showAll());
        return "dept";
    }

    @GetMapping("/showEmp")
    public String showEmp(Integer did, Model model) {
        model.addAttribute("list", deptService.findEmpByDetpId(did));
        return "showEmp";
    }
}
