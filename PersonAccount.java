package Demo2;

import java.util.Scanner;

public class PersonAccount extends Account{
    Scanner sc = new Scanner(System.in);
    private double fee;

    public PersonAccount(String accountNo, String customerName, float balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
   public float withDraw(){
       System.out.println("Mời bạn nhập số tiền cần gửi: ");
       return getBalance()+ Float.parseFloat(sc.nextLine());
   }
   public void deposite(){
       System.out.println("Nhập số tiền bạn cần  rút:");
       float outMoney = Float.parseFloat(sc.nextLine());
       if (outMoney<getBalance()){
           System.out.println("Bạn rút tiền thành công");
       }else {
           System.err.println("Xin lỗi tài khoản không đủ!");
           System.exit(0);
       };
   }
    @Override
    public String toString() {
        return super.toString()+"PersonAccount{" +
                "fee=" + fee +
                "} " ;
    }
    /**
     * Lớp PersonAccount kế thừa từ lớp Account có thêm thông số fee(phí giao dịch),
     * tạo các phương thức constructor phù hợp và gọi constructor lớp cha xuống.
     * Tạo phương thức withDraw() rút tiền và deposite() gửi tiền.
     * Tạo phương thức setter và getter cho các trường.
     * Ghi đè phương thức toString trả về toàn bộ thông tin tài khoản.
      */
}
