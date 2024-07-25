/* Creating the child class DebitCard and using instance variable
Here private access modifier has been use for variables to encapsulate the data and the concepts of encapulsation is used 
and  values are only use by this class whereas we can see that concept of inheritance is also use as it  has a keyword extends */
class DebitCard extends BankCard {
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {  // Here super keyword refers immediate parent class instance variable.
        super(cardId, issuerBank, bankAccount, balanceAmount);
        //Creating a method using set keyword. setter is a method that updates value of a variable.
        setClientName(clientName);
        //Here This keyword is used to differentiate between instance and local variables
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false; // initialization the value to zero
    }

    // Creating a method using get keyword also known as accessor method which return the value of private field pinNumber
    public int getPinNumber() 
    {
        return this.pinNumber;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field withdrawalAmount
    public int getWithdrawalAmount() 
    {
        return this.withdrawalAmount;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field dateOfWithdrawal
    public String getDateOfWithdrawal() 
    {
        return this.dateOfWithdrawal;
    }
    // Creating a method using get keyword also known as accessor method which return the value of private field hasWithdrawn
    public boolean getHasWithdrawn() 
    {
        return this.hasWithdrawn;
    }
    // Creating a method using set keyword also known as mutator method by passing arguments in the parenthesis
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        //Here This keyword is used to differentiate between instance and local variables
        if (this.pinNumber == pinNumber){
            if (withdrawalAmount <= getBalanceAmount()) {

                setWithdrawalAmount(withdrawalAmount);

                setBalanceAmount(getBalanceAmount() - withdrawalAmount);

                this.dateOfWithdrawal = dateOfWithdrawal;

                hasWithdrawn = true;

                System.out.println("Your Amount hasbeen successful Withdrawn And Your New balance is : " + getBalanceAmount());
            } 
            else 
            {
                //printing if we dont have succifient balance to wothdraw 
                System.out.println("Sorry !! You Don't have sufficient balance.");

            }

        }  

        else  
        {
            //Printing If we have enter inncorrect pin
            System.out.println("The PIN you have Entered is Incorrect !! Please Try Again.");
        }
    }

    // Display method is used to show all the information according to the given conditions
    public void display() {

        if (hasWithdrawn == true) {
            // Here super key word is used  to invoke immediate parent class constructor.
            super.display();
            //Printing the values of pinNumber
            System.out.println("PIN Number: " + pinNumber);
            //Printing the values of withdrawalAmount
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            //Printing the values of dateOfWithdrawal
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        }

        else
        {
            //Printing the values of balanceAmount
            //System.out.println("Your balance Total Balance is : "+ getBalanceAmount());
            super.display();
        }
    }
}