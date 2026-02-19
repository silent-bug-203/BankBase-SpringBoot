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
@Table(name = "account_balances")
@Getter @Setter
@NoArgsConstructor
public class AccountBalance {

    @Id
    @Column(name = "account_id", columnDefinition = "BINARY(16)")
    private UUID accountId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
