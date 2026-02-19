package com.example.demo.module.core.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "fraud_rules")
@Getter @Setter
@NoArgsConstructor
public class FraudRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rule_name", nullable = false)
    private String ruleName;

    @Column(precision = 19, scale = 2)
    private BigDecimal maxAmount;

    @Column(precision = 19, scale = 2)
    private BigDecimal dailyLimit;

    private Boolean active = true;
}
