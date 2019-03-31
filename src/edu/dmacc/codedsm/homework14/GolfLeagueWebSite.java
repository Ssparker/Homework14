package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GolfLeagueWebSite {
    private Boolean isOpen;
    private List<String> website;
    private List<String> people;
    private List<String> onLineTransaction;
    private Double onlineTransactionAmount;
    private List<String> paymentType;

    public GolfLeagueWebSite() {
        this.isOpen = true;
        this.website = new ArrayList<>();
        this.people = new ArrayList<>();
        this.onLineTransaction = new ArrayList<>();
        this.onlineTransactionAmount = 300d;
        this.paymentType = new ArrayList<>();
    }


    public GolfLeagueWebSite(Boolean isOpen, List<String> updateWebsite, List<String> people, List<String> onLineTranaction, Double onlineTransactionAmount, List<String> paymentType) {
        this.isOpen = isOpen;
        this.website = website;
        this.people = people;
        this.onLineTransaction = onLineTransaction;
        this.onlineTransactionAmount = onlineTransactionAmount;
        this.paymentType = paymentType;
    }

    public Boolean IsOpen(String isOpen) {
        return true;
    }

    public String updateWebsite(List<String> newFunctionality) {
        return "updateWebsite";
    }

    public String people(String men, String women, String leagueOfficers, String developer, String golfCourseOwner) {
        return "people";

    }

    public String payLeagueDues(String league, String golferName, Double dues) {
        return "paymentVerification";
    }

    public String receiveLeagueDues(String golferName, Double dues, String golfCourseOwner, Double moneyOut) {
        return "sendPaymentSuccessful";
    }

    public String paymentType(String debit, String credit) {
        return "paymentType";
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public List<String> getOnLineTransaction() {
        return onLineTransaction;
    }

    public void setOnLineTransaction(List<String> onLineTransaction) {
        this.onLineTransaction = onLineTransaction;
    }

    public Double getOnlineTransaction() {
        return onlineTransactionAmount;
    }

    public void setOnlineTransaction(Double onlineTransaction) {
        this.onlineTransactionAmount = onlineTransaction;
    }

    public List<String> getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(List<String> paymentType) {
        paymentType = paymentType;
    }

    public Double getOnlineTransactionAmount() {
        return onlineTransactionAmount;
    }

    public void setOnlineTransactionAmount(Double onlineTransactionAmount) {
        this.onlineTransactionAmount = onlineTransactionAmount;
    }

    @Override
    public String toString() {
        return "GolfLeagueWebSite{" +
                "isOpen=" + isOpen +
                ", website=" + website +
                ", people=" + people +
                ", onLineTransaction=" + onLineTransaction +
                ", onlineTransactionAmount=" + onlineTransactionAmount +
                ", paymentType=" + paymentType +
                '}';
    }
}







