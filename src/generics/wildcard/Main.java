package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new AzipsPayment(1, 1200));
        payments.add(new SwiftPayment(2, 2000));

        Payment payment = new Payment();
        int paymentsSum = payment.overallSum(payments);

        System.out.println(paymentsSum);
    }
}