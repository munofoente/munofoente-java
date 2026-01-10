package estudos.interfaces.exServiçoPagamento.model.services;

import estudos.interfaces.exServiçoPagamento.model.entities.Contract;
import estudos.interfaces.exServiçoPagamento.model.entities.Installment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ContractService {


    public void processContract(Contract contract, Integer months) {
        Date dueDate = contract.getDate();
        double amount;
        double result;
        for (int i = 1; i <= months ; i++) {
            PaymentService service = new PayPalService();
            amount = contract.getTotalValue() / months;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dueDate);
            calendar.add(Calendar.MONTH, 1);
            dueDate = calendar.getTime();
            result = service.fee(service.interest(amount,i));

            Installment installment = new Installment(dueDate, amount + result);
            System.out.println(installment);
        }

    }
}
