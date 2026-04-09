public class BankAccount {

    private int accNo;
    private String accName;
    private AccType.AccountType accType;
    private double accBalance;

    public BankAccount(int accNo, String accName, AccType.AccountType accType, double accBalance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getAccName() {
        return accName;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public AccType.AccountType getAccType() {
        return accType;
    }
    public void setAccType(AccType.AccountType accType) {
        this.accType = accType;
    }
    public double getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "--- Bank Account Details ---\n" +
        "Account No - " + accNo + "\n" +
        "Account Holder Name - " + accName + "\n" +
        "Account Type - " + accType + "\n" +
        "Account Balance - "+ accBalance;
    }
}