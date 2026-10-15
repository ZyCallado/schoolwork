public class OrderTest {
    public static void main(String[] args) {

        OrderCalculator calculator = new BasicOrder();
        OrderPlacer placer = (OrderPlacer) calculator;

        calculator.calculateTotal(10.0, 2);
        placer.placeOrder("John Doe", "123 Main St");

        // Optional features
        InvoiceGenerator invoiceGenerator = new FileInvoiceGenerator();
        EmailNotifier emailNotifier = new EmailService();

        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}