package estudos.interfaces.exServiçoPagamento.model.services;

public class PayPalService implements PaymentService{

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months / 100;
    }

    @Override
    public Double fee(Double amount) {
        return amount + (amount * 0.02);
    }
}
