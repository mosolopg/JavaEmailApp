package bankaccountapp;

public class Checking  extends Account{
    // List properties specific to a checking account properties
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit ){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW CHECKING ACCOUNT");

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to checking account
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your Checking Account Feature" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN " + debitCardPIN
        );
    }
}
