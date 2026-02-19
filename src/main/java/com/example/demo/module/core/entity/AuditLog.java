package com.example.demo.module.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

    @Entity
    @Table(name = "audit_logs")
    @Getter @Setter
    @NoArgsConstructor
    public class AuditLog {

        @Id
        @UuidGenerator
        @Column(columnDefinition = "BINARY(16)")
        private UUID id;

        @Column(name = "user_id", columnDefinition = "BINARY(16)")
        private UUID userId;

        @Column(nullable = false)
        private String action;

        @Column(columnDefinition = "TEXT")
        private String detail;

        @Column(name = "ip_address")
        private String ipAddress;

        @Column(name = "created_at", updatable = false)
        private LocalDateTime createdAt;
    }


