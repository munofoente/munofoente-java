package estudos.interfaces.exServiçoPagamento.model.services;

public interface PaymentService {
    Double fee(Double amount);
    Double interest(Double amount, Integer months);
}
