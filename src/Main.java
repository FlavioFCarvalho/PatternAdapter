import com.adapter.ThirdPartyPaymentAdapter;
import com.processor.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        // Usando o Adapter para chamar o serviço de pagamento de terceiros
        PaymentProcessor paymentProcessor = (PaymentProcessor) new ThirdPartyPaymentAdapter();
        paymentProcessor.pay(100.0);  // Pagamento de $100
    }
}
