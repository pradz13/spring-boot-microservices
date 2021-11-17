package com.mircoservices.example.department.controller;

import com.mircoservices.example.department.entity.Department;
import com.mircoservices.example.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Saving department details : " + DepartmentController.class.getSimpleName());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Finding department details for department id : " + departmentId + " : " + DepartmentController.class.getSimpleName());
        return departmentService.findDepartmentById(departmentId);
    }
}
