package com.orkes.audit.repository;

import com.orkes.audit.model.OrkesAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrkesAuditRepository extends JpaRepository<OrkesAudit, String> {
}