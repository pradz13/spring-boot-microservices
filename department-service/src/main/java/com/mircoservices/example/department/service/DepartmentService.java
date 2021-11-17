package com.mircoservices.example.department.service;

import com.mircoservices.example.department.entity.Department;
import com.mircoservices.example.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Saving department details : " + DepartmentService.class.getSimpleName());
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Finding department details for department id : " + departmentId + " : " + DepartmentService.class.getSimpleName());
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
