/* Creating the child class CreditCard and using instance variable
 Here private access modifier has been use for variables to encapsulate the data and the concepts of encapulsation is used 
 and  values are only use by this class whereas we can see that concept of inheritance is also use as it  has a keyword extends */
public class CreditCard extends BankCard{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount , int balanceAmount, int cvcNumber, double interestRate, String expirationDate){
        super(cardId, issuerBank, bankAccount, balanceAmount);
        
        setClientName(clientName);
        //Here This keyword is used to differentiate between instance and local variables
        this.cvcNumber = cvcNumber;
        //Here This keyword is used to differentiate between instance and local variables
        this.interestRate = interestRate;
        //Here This keyword is used to differentiate between instance and local variables
        this.expirationDate = expirationDate;
        
        this.isGranted = false; // initialization the value to zero
    
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field cvcNumber
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field creditLimit
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field interestRate
    public double getInterestRate()
    {
        return this.interestRate;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field gracePeriod
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field isGranted
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    // Creating a method using set keyword also known as mutator method by passing arguments in the parenthesis
    public void setCreditLimit(double CreditLimit, int GracePeriod){
        if (CreditLimit <= 2.5 * getBalanceAmount()){
            //Here This keyword is used to differentiate between instance and local variables
            this.creditLimit = CreditLimit;
            //Here This keyword is used to differentiate between instance and local variables
            this.gracePeriod = GracePeriod;
            //Here This keyword is used give the value true to instance varaible
            this.isGranted = true;
            //Printing if your your is granted
            System.out.println("Your Credit is granted ");
        } 
        
        else
        {
            //Printing if credit is not issued.
            System.out.println("Credit cannot be issued . Sorry !!!");
        }
        
    }
    //This is the method is used to cancel credit card
    public void cancelCreditCard() {
        this.cvcNumber = 0; // initialization the value to zero
        this.creditLimit = 0; // initialization the value to zero
        this.gracePeriod = 0; // initialization the value to zero
        this.isGranted = false; // initialization the value to false
        System.out.println("Your CreditCard is Cancel ");
    }
    // Creating a display method
    public void display() {
        // calling display  method from parent class
        //super.display();
        if (this.isGranted = true) 
        {
           // Printing the values of cvcNumber
            //System.out.println("Your CVC Number is : " + cvcNumber);
            //Printing the values of interestRate
            super.display();
            System.out.println("Your Total Interest Rate is : " + interestRate);
            //Printing the values of creditLimit
            System.out.println("Your Credit Limit is : " + creditLimit);
            //Printing the values of gracePeriod
            System.out.println("Your Grace Period is : " + gracePeriod);
            //Printing the values of expirationDate
            System.out.println("Your Credit Expiration date is : "+ expirationDate);
            //Printing the values of interestRate
            //Printing the values of cvcNumber
            System.out.println("Your CVC Number is : " + cvcNumber);
        } 
        
        else 
        {
            
            //Printing the values of cvcNumber
            System.out.println("Your CVC Number is : " + cvcNumber);
            //System.out.println("Your CreditLimit is :" + creditLimit);
            System.out.println("Your Grace period is :" + gracePeriod);
            //Printing the values of interestRate
            //System.out.println("Your Total Interest Rate is : " + interestRate);
            //Printing the values of expirationDate
            System.out.println("Your Credit Expiration Date is : " + expirationDate);
            
            
            //super.display();
            
        }
    }  
}
        