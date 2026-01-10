package estudos.interfaces.exServiçoPagamento.model.services;

public class PayPalService implements PaymentService{

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * months * 0.01;
    }

    @Override
    public Double fee(Double amount) {
        return amount * 0.02;
    }
}
