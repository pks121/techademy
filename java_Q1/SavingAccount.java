public class SavingAccount extends Account {
    private final double minimumBalance; 

    
    public SavingAccount(double balance, double interestRate, double minimumBalance) {
        super(balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    
    @Override
    public void calculateInterest() {
        if (balance >= minimumBalance) {
            super.calculateInterest();
        } else {
            System.out.println("Insufficient balance to earn interest.");
        }
    }

    
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Minimum Balance: " + minimumBalance);
    }
}
