package com.orkes.audit.controller;

import com.orkes.audit.model.OrkesAudit;
import com.orkes.audit.service.OrkesAuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orkes-audit")
@RequiredArgsConstructor
public class OrkesAuditController {

    private final OrkesAuditService orkesAuditService;

    @GetMapping
    public ResponseEntity<List<OrkesAudit>> findAll() {
        return ResponseEntity.ok(orkesAuditService.findAll());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Employee> findById(@PathVariable Long id) {
//        try {
//            return ResponseEntity.ok(employeeService.findById(id));
//        } catch (NoSuchElementException e) {
//            return ResponseEntity.notFound().build();
//        }
//    }

}