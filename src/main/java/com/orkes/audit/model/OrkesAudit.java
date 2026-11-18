package com.orkes.audit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orkes_audit")
public class OrkesAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seqNo;

    @Column(name = "work_item", nullable = false)
    private String workItem;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "workflow_name", nullable = false)
    private String workflowName;

    @Column(name = "type")
    private String type;

    @Column(name = "data")
    private String data;
}