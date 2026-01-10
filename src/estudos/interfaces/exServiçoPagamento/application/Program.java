package estudos.interfaces.exServiçoPagamento.application;

import estudos.interfaces.exServiçoPagamento.model.entities.Contract;
import estudos.interfaces.exServiçoPagamento.model.entities.Installment;
import estudos.interfaces.exServiçoPagamento.model.services.ContractService;
import estudos.interfaces.exServiçoPagamento.model.services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException{

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the contract data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.println("Date (dd/MM/yyyy): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Contract value: ");
            double value = sc.nextDouble();
            Contract obj = new Contract(number, date, value);
            ContractService service = new ContractService(new PayPalService());

            System.out.print("Enter the number of installments: ");
            int n = sc.nextInt();

            service.processContract(obj, n);
            System.out.println("Installments: ");

            for(Installment installment : obj.getInstallments()){
                System.out.println(installment);
            }

            sc.close();
    }
}
