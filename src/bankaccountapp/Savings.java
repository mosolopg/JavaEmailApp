package bankaccountapp;

public class Savings extends Account {

    // List properties specific to a savings account properties
    int safetyDepositBoxID;
    int safetyDepositBoxKey;


    // Constructor to initialize savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW SAVINGS ACCOUNT");
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
        //System.out.println(safetyDepositBoxID);

    }

    // List any methods specific to savings account

    @Override
    public void showInfo() {
        super.showInfo();
        //System.out.println("ACCOUNT TYPE: SAVINGS");
        System.out.println(
                " Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
