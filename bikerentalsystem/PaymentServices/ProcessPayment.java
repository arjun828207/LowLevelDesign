package PaymentServices;

public class ProcessPayment {

    PaymentProcessor paymentProcessor;

    public ProcessPayment(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void DoPayment() {
        paymentProcessor.ProcessPaymentRequest();
    }

}
