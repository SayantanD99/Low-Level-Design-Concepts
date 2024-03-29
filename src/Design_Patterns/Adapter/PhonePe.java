package Design_Patterns.Adapter;
public class PhonePe {
    public static void main(String[] args) {

        BankApiAdapter bankApiAdapter = new ICICIAdapter();

        bankApiAdapter.sendMoney("Santa", "Sayantan", 10000);
        bankApiAdapter.checkBalance("10001235464564234324");

        BankApiAdapter bankApiAdapter2 = new YBAdapter();

        bankApiAdapter2.sendMoney("Sayantan", "Santa", 20000);
        bankApiAdapter2.checkBalance("1235464564234324");
    }
}