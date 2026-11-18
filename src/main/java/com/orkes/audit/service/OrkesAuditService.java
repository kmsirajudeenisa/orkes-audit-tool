package com.orkes.audit.service;

import com.orkes.audit.model.OrkesAudit;

import java.util.List;

public interface OrkesAuditService {
    List<OrkesAudit> findAll();
}