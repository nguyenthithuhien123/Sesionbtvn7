package Demo2;

import java.util.Scanner;

public class SavingAccount extends Account{
    private float rate;
    private int period;

    public SavingAccount(String accountNo, String customerName, float balance, float rate, int period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public float getRate(int period){
        return switch (period) {
            case 1 -> 5f / 100;
            case 3 -> 5.5f / 100;
            case 6 -> 6f / 100;
            case 12 -> 7f / 100;
            case 24 -> 7.5f / 100;
            case 36 -> 8f / 100;
            default -> 1.8f/100;
        };
    }
    public float checkInteres(float m,float balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào thời hạn cần gửi tiền ");
       int period = Integer.parseInt(sc.nextLine());
        rate= getRate(period);
       return (m+balance)*rate;
    }

    @Override
    public String toString() {
        return super.toString()+  "SavingAccount{" +
                "rate=" + rate +
                ", period=" + period +
                "} " ;
    }
}
