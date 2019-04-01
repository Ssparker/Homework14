package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.List;

public class PaymentType {
    public List <String> debit;
    public List <String> credit;

    public PaymentType() {
        this.debit = new ArrayList<>();
        this.credit = new ArrayList<>();
    }

    public PaymentType(List<String> debit, List<String> credit) {
        debit = debit;
        credit = credit;
    }

    public List<String> getDebit() {
        return debit;
    }

    public void setDebit(List<String> debit) {
        this.debit = debit;
    }

    public List<String> getCredit() {
        return credit;
    }

    public void setCredit(List<String> credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "debit='" + debit + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
}
