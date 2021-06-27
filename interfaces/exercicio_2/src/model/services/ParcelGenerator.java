package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ParcelGenerator {

    private PaymentService paymentService;

    public ParcelGenerator(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double parcel = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double parcelUpdateSimple = parcel + paymentService.interest(parcel, i);
            double fullParcel = parcelUpdateSimple + paymentService.paymentFee(parcelUpdateSimple);

            contract.addInstallment(new Installment(addMonths(contract.getDate(), i), fullParcel));
        }
    }

    private Date addMonths(Date date, int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, i);
        return cal.getTime();
    }
}
