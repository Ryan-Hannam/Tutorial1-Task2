


/**
 *
 * @author RyanHannam
 */
public class FixedDeposit {
      
    private int accountNumber; //defines a variable for the account number starting at 1001
    private double periodinYears; //defines a variable for the period of the deposit
    private double initialAmount; // defines a variable for the initial amount deposited into an account
    private static int[] accountID = new int[3]; //defiens a variable to keep track of a unique accountID
    
        public FixedDeposit()
        {
        
        }
    
        public FixedDeposit (int theAccount, double thePeriod, double initAmount)
        {
            setAccountNumber (theAccount);
        }
    
        public void setAccountID ()
        {
            for (int a = 0; a <3; a++)
            {
                accountID[a] = a;
            }
        }
        
        public void setAccountNumber(int theAccount)
        {
         
        }
    
        public void setPeriod (double thePeriod)
        {
        
        }
    
        public void setInitAmount (double initAmount)
        {
        
        }
      
        public int getAccountNumber ()
        {
            return accountNumber;
        }
    
        public double getPeriod ()
        {
            return periodinYears;
        }
     
        public double getInitAmount ()
        {
            return initialAmount;
        }
      
       // public int getAccountID ()
       // {
       //     return accountID[];
       // }
        
        public String toString()
        {
            return String.format( "%s: %f\n%s: %.2f\n%s: %f",
			"Account Number", getAccountNumber(), "Initial Amount", getInitAmount(),
			"Period (In Years)", getPeriod() );
        }
}

