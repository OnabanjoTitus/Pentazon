package com.pentazon.payment;

import java.time.LocalDate;
import java.util.Date;

public class PaymentCard {
    private String cardNumber;
    private String name;
    private LocalDate expiry;
    private LocalDate issue;

    public PaymentCard(String cardNumber, String name, LocalDate expiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expiry = expiry;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    public LocalDate getIssue() {
        return issue;
    }

    public void setIssue(LocalDate issue) {
        this.issue = issue;
    }
}
