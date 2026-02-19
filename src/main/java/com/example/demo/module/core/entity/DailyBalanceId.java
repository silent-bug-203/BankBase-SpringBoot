package com.example.demo.module.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DailyBalanceId implements Serializable {

    @Column(name = "account_id", columnDefinition = "BINARY(16)")
    private UUID accountId;

    @Column(name = "snapshot_date")
    private LocalDate snapshotDate;
}
