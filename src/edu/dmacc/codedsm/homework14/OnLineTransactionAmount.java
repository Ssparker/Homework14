package edu.dmacc.codedsm.homework14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OnLineTransactionAmount {
public double leaguedues = 50;
public double leaguecosts = 300;

    public OnLineTransactionAmount() {
        this.leaguedues = leaguedues;
        this.leaguecosts = leaguecosts;
    }

    public OnLineTransactionAmount(double leaguedues, double leaguecosts){
        leaguedues = leaguedues;
        leaguecosts = leaguecosts;
    }

    @Override
    public String toString() {
        return "OnLineTransactionAmount{" +
                "leaguedues=" + leaguedues +
                ", leaguecosts=" + leaguecosts +
                '}';
    }

    public double getLeaguedues() {
        return leaguedues;
    }

    public void setLeaguedues(double leaguedues) {
        this.leaguedues = leaguedues;
    }

    public double getLeaguecosts() {
        return leaguecosts;
    }

    public void setLeaguecosts(double leaguecosts) {
        this.leaguecosts = leaguecosts;
    }
}
