interface Payment {
    void pay();
    void refund();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via Credit Card");
    }

    @Override
    public void refund() {
        System.out.println("Refund to Credit Card");
    }
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refund to UPI");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p1.refund();

        p2.pay();
        p2.refund();
    }
}