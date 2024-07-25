/* Creating the main class Bankcard and using instance variable
 Here private access modifier has been use for variables to encapsulate the data 
 and only use by this class */
 
public class BankCard{              
     private int cardId;           
     private String clientName;         
     private String issuerBank;
     private String bankAccount;
     private int balanceAmount;
    
    
     //Creating a constructor by passing the arguments in the parenthesis
    public BankCard(int cardId, String issuerBank, String bankAccount, int balanceAmount)
    
    {  //Here This keyword is used to differentiate between instance and local variables
        
       this.cardId = cardId;                 
       this.clientName ="";                   
       this.issuerBank=issuerBank;          
       this.bankAccount = bankAccount;
       this.balanceAmount = balanceAmount;
       
    }
    
    // Creating a method using get keyword also known as accessor method which return the value of private field cardId
    public int getCardId()
        {
            return this.cardId;
        }
    // Creating a method using get keyword also known as accessor method which return the value of private field clientName
    public String getClientName()
        {
            return this.clientName;
        }
    // Creating a method using get keyword also known as accessor method which return the value of private field  issuerBank    
    public String getIssuerBank()
        {
            return this.issuerBank;
        }
    // Creating a method using get keyword also known as accessor method which return the value of private field bankAccount   
    public String getBankAccount()
        {
            return this.bankAccount;
        }
    // Creating a method using get keyword also known as accessor method which return the value of private field balanceAmount    
    public int getBalanceAmount()
        {
            return this.balanceAmount;
        }
    // Creating a method using set keyword also known as mutator method by passing arguments in the parenthesis
        public void setClientName( String clientName) {
        this.clientName = clientName;
    }
    // Creating a method using set keyword also known as mutator method by passing arguments in the parenthesis
    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
            
            
        }
     // Display method is the method which used to show all the details of BankCard according to their conditions   
        public void display (){
            if(clientName.equals("")){
                    //Printing the value if clientName is not given
                    System.out.println("The Value of Client Name Is Not Given");
                    //printing the value of cardid
                    System.out.println("Your Card ID No : " + cardId);
                    //printing the value of issuerBank
                    System.out.println("Your Issuer Bank is : " + issuerBank);
                    //printing the value of bankAccount
                    System.out.println("Your Bank Account No. : " + bankAccount);
                    //printing the value of balanceAmount
                    System.out.println("Your Total Balance Amount is : " + balanceAmount);
            }
            else{
                    //printing the value of cardid
                    System.out.println("Your Card ID No. is : " + cardId);
                    //printing the value of clientName
                    System.out.println("The Client Name is : " + clientName);
                    //printing the value of issuerBank
                    System.out.println("Your Issuer Bank is : " + issuerBank);
                    //printing the value of bankAccount
                    System.out.println("Your Bank Account No. : " + bankAccount);
                    //printing the value of balanceAmount
                    System.out.println("Your Total Balance Amount is : " + balanceAmount);
            }
        }
        
        
        
}

    
    
    
    
    
    
