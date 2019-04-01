package edu.dmacc.codedsm.homework14;

public class Runner {

    public static void main(String[] args) {

        GolfLeagueWebSite sherylsWebsite = new GolfLeagueWebSite();
        System.out.println(sherylsWebsite);

        UpdateWebsite updateWebsite = new UpdateWebsite();
        System.out.println(updateWebsite);
        
        OnLineTransactionAmount onlineTransactionAmount = new OnLineTransactionAmount();
        System.out.println(onlineTransactionAmount);
        
        OnLineTransactions onlineTransactions = new OnLineTransactions();
        System.out.println(onlineTransactions);
        
        people personsInvolvedInLeague = new people();
        System.out.println(personsInvolvedInLeague);
        
        PaymentType paymentType = new PaymentType();
        System.out.println(paymentType);

    }

}
