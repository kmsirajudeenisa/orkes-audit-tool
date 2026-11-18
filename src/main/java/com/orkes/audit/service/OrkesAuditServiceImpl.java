package com.orkes.audit.service;

import com.orkes.audit.model.OrkesAudit;
import com.orkes.audit.repository.OrkesAuditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrkesAuditServiceImpl implements OrkesAuditService {

    private final OrkesAuditRepository orkesAuditRepository;

    @Override
    public List<OrkesAudit> findAll() {
        return orkesAuditRepository.findAll();
    }
}