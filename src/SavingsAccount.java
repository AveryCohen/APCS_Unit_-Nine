/**
 *       <<< THIS CODE IS NOT COMPLETE >>>
 *   An account that earns interest at a fixed rate.
 */
public class SavingsAccount
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 10;

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given interest rate.
     */
    public SavingsAccount(double rate)  {
        interestRate = rate;
    }

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given balance
     *   and a given interest rate.
     */
    public SavingsAccount(double initialBalance, double rate) {
        if (initialBalance >= MINIMUM_BALANCE) {
            super(initialBalance);
        }
    }


    /**  <<< COMPLETE THIS METHOD >>>
     *   Adds the earned interest to the account balance.
     */
    public void addInterest()   {
        // <<< CODE NOT COMPLETE >>>
    }

    /** <<< COMPLETE THIS METHOD>>>
     *  overrides withdraw in the superclass
     *  only allows withdrawal to occur if
     *  resulting balance > MINIMUM_BALANCE
     */
    public void withdraw(double amount)  {
        // <<< Code Not Complete >>>
    }
}

