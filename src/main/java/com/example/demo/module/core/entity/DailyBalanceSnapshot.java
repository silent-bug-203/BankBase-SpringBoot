package com.example.demo.module.core.entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "daily_balance_snapshot")
@Getter @Setter
@NoArgsConstructor
public class DailyBalanceSnapshot {

    @EmbeddedId
    private DailyBalanceId id;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;
}
