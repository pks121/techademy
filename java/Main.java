public class Main {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount(5000, 4, 1000);
        System.out.println("Saving Account:");
        savingsAccount.displayAccountDetails();
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountDetails();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(3000, 3, 5000);
        System.out.println("Current Account:");
        currentAccount.displayAccountDetails();
        currentAccount.calculateInterest();
        currentAccount.displayAccountDetails();
    }
}
