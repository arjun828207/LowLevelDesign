import PaymentServices.CardPayment;
import PaymentServices.ProcessPayment;

class main {
    public static void main(String[] args) {

        ProcessPayment payment = new ProcessPayment(new CardPayment());
        payment.DoPayment();
    }
}