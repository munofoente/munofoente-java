package estudos.interfaces.exServiçoPagamento.model.services;

import estudos.interfaces.exServiçoPagamento.model.entities.Contract;
import estudos.interfaces.exServiçoPagamento.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;


public class ContractService {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {

        Date dueDate = contract.getDate();
        double amount;
        double interest;
        double fee;

        for (int i = 1; i <= months; i++) {
            amount = contract.getTotalValue() / months;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dueDate);
            calendar.add(Calendar.MONTH, 1);
            dueDate = calendar.getTime();
            interest = paymentService.interest(amount, i);
            fee = paymentService.fee(amount + interest);
            amount = amount + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, amount));
        }

    }
}
