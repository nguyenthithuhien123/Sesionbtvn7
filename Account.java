package Demo2;

public class Account {
    private String accountNo;
    private String customerName;
    private float balance;

    public Account(String accountNo, String customerName, float balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }

    /**Lớp Account lưu thông tin về tài khoản: accountNo, customerName, balance (các trường có bổ từ truy cập là protected).
     * Tạo các phương thức constructors phù hợp, tạo các phương thức setter cho các trường */
}
