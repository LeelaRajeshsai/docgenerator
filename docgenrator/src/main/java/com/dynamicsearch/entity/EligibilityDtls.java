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
    private int PLAN_ID;
    private long CASE_NUM;
    private String PLAN_NAME;
    private boolean PLAN_STATUS;
    private String HOLDER_NAME;
    private long HOLDER_SSN;
    private double BENEFIT_AMT;
    private LocalDate START_DATE;
    private LocalDate END_DATE;
    private String DENIAL_REASN;

}
