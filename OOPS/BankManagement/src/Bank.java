import java.util.ArrayList;

interface BankFunctionalities {
    abstract String create(String accName, String accType);
    abstract String withdraw(int accNo, double amt);
    abstract String deposit(int accNo, double amt);
    abstract String transfer(int accNo1, int accNo2, double amt);
    abstract String view(int accNo);
}

public class Bank implements BankFunctionalities {

    private int no = 0;

    private ArrayList<BankAccount> bankAccount = new ArrayList<>();

    public String create(String accName, String accType) {
        BankAccount b = null;
        if(accType.equalsIgnoreCase("savings")) {
            b = new BankAccount(++no, accName, AccType.AccountType.SAVINGS, 500);
            bankAccount.add(b);
            return "Account created successfully!";
        }
        else if(accType.equalsIgnoreCase("current")) {
            b = new BankAccount(++no, accName, AccType.AccountType.CURRENT, 0);
            bankAccount.add(b);
            view(b.getAccNo());
            return "Account created successfully!";
        }
        return "Account creation failed!";
    }

    public String deposit(int accNo, double amt) {
        for(BankAccount b: bankAccount) {
            if(b.getAccNo() == accNo) {
                b.setAccBalance(b.getAccBalance() + amt);
                return "Amount deposited successfully!";
            }
        }
        return "Amount deposit failed!";
    }

    @Override
    public String withdraw(int accNo, double amt) {
        for(BankAccount b: bankAccount) {
            if(b.getAccNo() == accNo) {
                if(b.getAccType() == AccType.AccountType.SAVINGS) {
                    if((b.getAccBalance() - amt) < 500) {
                        return "Amount withdraw failed due to minimum balance!";
                    }
                    else {
                        b.setAccBalance(b.getAccBalance()-amt);
                        return "Amount withdrawn successfully!";
                    }
                }
                else if(b.getAccType() == AccType.AccountType.CURRENT) {
                    if((b.getAccBalance() - amt) < 0) {
                        return "Amount withdraw failed due to insufficient balance!";
                    }
                    else {
                        b.setAccBalance(b.getAccBalance()-amt);
                        return "Amount withdrawn successfully!";
                    }
                }
            }
        }
        return "Amount withdrawn failed!";
    }

    @Override
    public String transfer(int accNo1, int accNo2, double amt) {
        BankAccount b1 = null;
        BankAccount b2 = null;
        for(BankAccount b: bankAccount) {
            if(b.getAccNo() == accNo1) {
                b1 = b;
            }
            if(b.getAccNo() == accNo2) {
                b2 = b;
            }
        }

        if(b1 != null && b2 != null) {
            if((b1.getAccType() == AccType.AccountType.SAVINGS) && ((b1.getAccBalance() - amt) >= 500)) {
                b1.setAccBalance(b1.getAccBalance()-amt);
                b2.setAccBalance(b2.getAccBalance() + amt);
                return "Amount transfered successfully!";
            }
            else if((b1.getAccType() == AccType.AccountType.CURRENT) && ((b1.getAccBalance() - amt) >= 0)) {
                b1.setAccBalance(b1.getAccBalance()-amt);
                b2.setAccBalance(b2.getAccBalance() + amt);
                return "Amount transfered successfully!";
            }
        }

        return "Amount transfer failed!";
    }

    @Override
    public String view(int accNo) {
        for(BankAccount b: bankAccount) {
            if(b.getAccNo() == accNo) {
                return b.toString();
            }
        }
        return "--Account not found!--";
    }

}