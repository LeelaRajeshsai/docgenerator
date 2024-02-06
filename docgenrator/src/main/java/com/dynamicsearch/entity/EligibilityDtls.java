package com.dynamicsearch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "ELIgility_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EligibilityDtls {
    @Id
    private int eligID;
    private Long caseNum;
    private String planName;
    private String planStatus;
    private Double benefitAmt;
    private LocalDate startDate;
    private LocalDate endDate;
    private String denailReason;

    private String holderName;
    private Long holderSsn;
}
