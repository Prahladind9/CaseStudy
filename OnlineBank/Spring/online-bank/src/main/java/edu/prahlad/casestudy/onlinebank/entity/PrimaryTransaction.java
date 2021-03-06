package edu.prahlad.casestudy.onlinebank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name ="primaryTransactionId_Seq")
public class PrimaryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "primaryTransactionId_Seq")
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "primary_account_id") //this join column name can be anything
    private PrimaryAccount primaryAccount;

}
