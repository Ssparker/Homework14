package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.List;

public class OnLineTransactions {
    public List <String> leagueDues = new ArrayList <> ();
    public List <String> costs = new ArrayList <> ();

    public OnLineTransactions () {
        this.leagueDues = leagueDues;
        this.costs = costs;
    }

    public OnLineTransactions(List<String> costs, List <String> leagueDues) {
        leagueDues = leagueDues;
        costs = costs;
    }

    @Override
    public String toString() {
        return "OnLineTransactions{" +
                "leagueDues='" + leagueDues + '\'' +
                ", costs='" + costs + '\'' +
                '}';
    }

    public List<String> getLeagueDues() {
        return leagueDues;
    }

    public void setLeagueDues(List<String> leagueDues) {
        this.leagueDues = leagueDues;
    }

    public List<String> getCosts() {
        return costs;
    }

    public void setCosts(List<String> costs) {
        this.costs = costs;
    }
}

