public class CurrentAccount extends Account {
    private final double overdraftLimit; 

    
    public CurrentAccount(double balance, double interestRate, double overdraftLimit) {
        super(balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }

    
    @Override
    public void calculateInterest() {
        if (balance > 0) {
            super.calculateInterest();
        } else {
            System.out.println("No interest for negative balance.");
        }
    }

    
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
