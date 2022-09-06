package com.pgr301.exam.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Transaction {
    private String password;
    private double amount;

}
