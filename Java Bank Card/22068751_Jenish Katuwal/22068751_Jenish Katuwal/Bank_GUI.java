import java.awt.*;
/*
 * import java.awt.Font;
 * import java.awt.Color;
*/
import java.awt.event.*;
import javax.swing.*;
/*
 * import javax.swing.JFrame;
 * import javax.swing.JPanel;
 * import javax.swing.JLabel;
 * import javax.swing.JTextArea;
 * import javax.swing.JTextField;
 * import javax.swing.JButton;
 * import javax.swing.JComboBox;
 * import javax.swing.JOptionPane;
*/
import java.util.ArrayList;

public class Bank_GUI implements ActionListener{
    // This is for Bank GUI
    /*
    In the Code Here JF means JavaFrame
    jb - Means JButtons
    jl - Means JLabel
    tf-  Means JTextField
    JP-  Means JPanel
     */
    JFrame JF;
    JPanel JP1, JP2,JP3, Sub_JP2;

    
    // DebitCard Variables are Decleared Here
    private JLabel Debit_JL, CleintName_jl, CardID_jl,CardID_jl1, IssuerBank_jl, BankAccount_jl, PinNumber_jl,PinNumber_jl1,BalanceAmount_jl, WithdrawalAmount_jl, WithdrawalDate_jl,WithdrawMoney_jl;
    private JTextField ClientName_tf, CardID_tf,CardID_tf1, IssuerBank_tf, BankAccount_tf,PinNumber_tf,PinNumber_tf1,BalanceAmount_tf,WithdrawalAmount_tf;
    private JButton GoToCreditCard_jb,DebitCard_jb, Clear_jb, Display_jb,withdraw_jb, Proceed_jb, goback_jb;
    private String year[]= {"Year","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    private String  month[] = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
    private String day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private JComboBox <String> Year_Cbox, Month_Cbox, Day_Cbox;

          
    // CreditCard Variables are Decleared Here
    private JLabel Credit_JL, CardId_jl, creditclientname_jl, creditissuerbank_jl, creditbankacc_jl,cvc_jl,creditbalanceAmt_jl,Interestrate_jl, cardid_jl1,setcreditLimit_jl,creditlimit_jl, graceperiod_jl, expirationdate_jl;
    private JTextField CardId_tf,creditclientname_tf,creditissuerbank_tf,creditbankacc_tf,creditbalanceAmt_tf, cvc_tf,Interestrate_tf ,cardid_tf1,creditlimit_tf,graceperiod_tf;
    private JButton AddcreditCard, gotodebit_jb, display1_jb, clear1_jb,cancel_jb ,setCreditLmt_jb;
    private String year1[]= {"Year","2023","2024","2025","2026","2027","2028","2029","2030", "2031"};
    private String  month1[] = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
    private String day1[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private JComboBox <String> Year_Cbox1, Month_Cbox1, Day_Cbox1;
    // BankCard ArrayList is Created Here
    ArrayList <BankCard> BankCardarray = new ArrayList<BankCard>();

    // Declearing DebitCard object as obj1
    DebitCard obj1;
    // Declearing CreditCard object as obj2
    CreditCard obj2;
    
    //  Creating Constructor of Bank_GUI
    public Bank_GUI(){
        // Declearing JF setBounds
        JF = new JFrame("BankGUI-Demo");
        JF.setBounds(330,100,904,553);
        // Declearing JP1 and setting bounds and background color
        JP1 = new JPanel();
        JP1.setBounds(0,0,904,553);
        JP1.setBackground(new Color(203,244,217));
        // Declearing JP3 and setting bounds and background color
        JP3 = new JPanel();
        JP3.setBounds(0,0,310,474);
        JP3.setBackground(new Color(203,244,217));

        // Declearing JP2 and setting bounds and background color
        JP2 = new JPanel();
        JP2.setBounds(0,0,689,682);
        JP2.setBackground(new Color(203,244,217));

        // Declearing Sub_JP2 and setting bounds and background color
        Sub_JP2 = new JPanel();
        Sub_JP2.setBounds(334,65,332,414);
        Sub_JP2.setBackground(new Color(150,244,217));

        Debit_JL = new JLabel("Add Debit Card Details Here");
        Debit_JL.setBounds(247,35,398,48);
        Debit_JL.setFont(new Font("Arial", Font.BOLD, 26));
        /*
         Here it creates a Jlabel with the label "clientName" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "clientName".
         */
        CleintName_jl = new JLabel("Client Name :");
        CleintName_jl.setFont(new Font("Arial", Font.BOLD, 18));
        CleintName_jl.setBounds(44,95,173,34);
        /*
         Here it creates a Jlabel with the label "clientName" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "clientName".
         */
        ClientName_tf = new JTextField();
        ClientName_tf.setBounds(44,129,324,45);
        ClientName_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "CardId" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "CardId".
         */
        CardID_jl = new JLabel("Card ID :");
        CardID_jl.setBounds(524,87,173,34);
        CardID_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "CardId" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "CardId".
         */
        CardID_tf = new JTextField();
        CardID_tf.setBounds(524,121,331,45);
        CardID_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "IssuerBank" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "issuerBank".
         */ 
        IssuerBank_jl = new JLabel("Issuer Bank :");
        IssuerBank_jl.setBounds(44,189,173,35);
        IssuerBank_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "IssuerBank" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "issuerBank".
         */ 

        IssuerBank_tf = new JTextField();
        IssuerBank_tf.setBounds(44,224,324,45);
        IssuerBank_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "bankAccount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "bankAccount".
         */
        BankAccount_jl = new JLabel("Bank Account :");
        BankAccount_jl.setBounds(524,188,180,35);
        BankAccount_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "bankAccount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "bankAccount".
         */
        BankAccount_tf = new JTextField();
        BankAccount_tf.setBounds(524,223,331,45);
        BankAccount_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "pinnumber" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "pinnumber".
         */
        PinNumber_jl = new JLabel("Pin Number :");
        PinNumber_jl.setBounds(44,283,173,34);
        PinNumber_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "pinnumber" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "pinnumber".
         */
        PinNumber_tf = new JTextField();
        PinNumber_tf.setBounds(44,317,324,46);
        PinNumber_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "balanceAmount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "balanceAmount".
         */
        BalanceAmount_jl = new JLabel("Balance Amount :");
        BalanceAmount_jl.setBounds(524,283,198,34);
        BalanceAmount_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "balanceAmount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "balanceAmount".
         */
        BalanceAmount_tf = new JTextField();
        BalanceAmount_tf.setBounds(524,317,331,46);
        BalanceAmount_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a JButton with the label "DebitCard_jb" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "DebitCard_jb".
         */
        DebitCard_jb = new JButton("Add Debit Card");
        DebitCard_jb.setBounds(381,375,173,49);
        DebitCard_jb.setFont(new Font("Arial", Font.BOLD, 18));
        DebitCard_jb.setFocusable(false);
        DebitCard_jb.setHorizontalTextPosition(JButton.CENTER);
        DebitCard_jb.setVerticalTextPosition(JButton.BOTTOM);
        DebitCard_jb.setForeground(new Color(53, 54, 50));
        DebitCard_jb.setBackground(new Color(154,238,246));
        DebitCard_jb.setBorder(BorderFactory.createEtchedBorder());
        /*
         Here it creates a JButton with the label "GoToCreditCard_jb" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "GoToCreditCard_jb".
         */
        GoToCreditCard_jb = new JButton("Go To Credit Card");
        GoToCreditCard_jb.setFont(new Font("Arial", Font.BOLD, 18));
        GoToCreditCard_jb.setBounds(55,440,198,32);
        GoToCreditCard_jb.setFocusable(false);
        GoToCreditCard_jb.setHorizontalTextPosition(JButton.CENTER);
        GoToCreditCard_jb.setVerticalTextPosition(JButton.BOTTOM);
        GoToCreditCard_jb.setForeground(new Color(53, 54, 50));
        GoToCreditCard_jb.setBackground(new Color(154,238,246));
        GoToCreditCard_jb.setBorder(BorderFactory.createEtchedBorder());
        /*
         Here it creates a JButton with the label "Clear" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "Clear_jb".
         */
        Clear_jb = new JButton("Clear");
        Clear_jb.setBounds(298,440,107,32);
        Clear_jb.setFont(new Font("Arial", Font.BOLD, 18));
        Clear_jb.setFocusable(false);
        Clear_jb.setHorizontalTextPosition(JButton.CENTER);
        Clear_jb.setVerticalTextPosition(JButton.BOTTOM);
        Clear_jb.setForeground(new Color(53, 54, 50));
        Clear_jb.setBackground(new Color(255,129,129));
        Clear_jb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        /*
         Here it creates a JButton with the label "Display" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "Display".
         */
        Display_jb = new JButton("Display");
        Display_jb.setBounds(498,440,107,32);
        Display_jb.setFont(new Font("Arial", Font.BOLD, 18));
        Display_jb.setFocusable(false);
        Display_jb.setHorizontalTextPosition(JButton.CENTER);
        Display_jb.setVerticalTextPosition(JButton.BOTTOM);
        Display_jb.setForeground(new Color(53, 54, 50));
        Display_jb.setBackground(new Color(171,246,171));
        Display_jb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        /*
         Here it creates a JButton with the label "Withdraw" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "Withdraw".
         */
        withdraw_jb = new JButton("Withdraw");
        withdraw_jb.setBounds(697,440,132,32);
        withdraw_jb.setFont(new Font("Arial", Font.BOLD, 18));
        withdraw_jb.setFocusable(false);
        withdraw_jb.setHorizontalTextPosition(JButton.CENTER);
        withdraw_jb.setVerticalTextPosition(JButton.BOTTOM);
        withdraw_jb.setForeground(new Color(53, 54, 50));
        withdraw_jb.setBackground(new Color(154,238,246));
        withdraw_jb.setBorder(BorderFactory.createEtchedBorder());
        /*
         Here it creates a Jlabel with the label "Credit_JL" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "Credit_JL".
         */
        Credit_JL = new JLabel("Add Credit Card Details");
        Credit_JL.setBounds(184,13,294,39);
        Credit_JL.setFont(new Font("Arial", Font.BOLD, 20));
        /*
         Here it creates a Jlabel with the label "Card Id" and  and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "CardId".
         */
        CardId_jl = new JLabel("Card ID :");
        CardId_jl.setBounds(30,56,82,20);
        CardId_jl.setFont(new Font("Arial", Font.BOLD, 17));
        /*
         Here it creates a Jlabel with the label "Card Id" and  and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "CardId".
         */
        CardId_tf = new JTextField();
        CardId_tf.setBounds(30,80,227,28);
        CardId_tf.setFont(new Font("Arial", Font.BOLD, 15));
        /*
         Here it creates a Jlabel with the label "ClientName" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "clientName".
         */
        creditclientname_jl = new JLabel("Client Name :");
        creditclientname_jl.setBounds(30,120,126,20);
        creditclientname_jl.setFont(new Font("Arial", Font.BOLD, 17));
        /*
         Here it creates a Jlabel with the label "ClientName" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "clientName".
         */
        creditclientname_tf = new JTextField();
        creditclientname_tf.setBounds(30,144,227,28);
        creditclientname_tf.setFont(new Font("Arial", Font.BOLD, 15));
        /*
         Here it creates a Jlabel with the label "issuerbank" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "issuerbank".
         */
        creditissuerbank_jl = new JLabel("Issuer Bank :");
        creditissuerbank_jl.setFont(new Font("Arial", Font.BOLD, 17));
        creditissuerbank_jl.setBounds(30,184,126,20);
        /*
         Here it creates a Jlabel with the label "issuerbank" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "issuerbank".
         */
        creditissuerbank_tf = new JTextField();
        creditissuerbank_tf.setBounds(30,208,227,28);
        creditissuerbank_tf.setFont(new Font("Arial", Font.BOLD, 15));

        creditbankacc_jl = new JLabel("Bank Account :");
        creditbankacc_jl.setBounds(30,248,140,20);
        creditbankacc_jl.setFont(new Font("Arial", Font.BOLD, 17));

        creditbankacc_tf = new JTextField();
        creditbankacc_tf.setBounds(30,272,227,28);
        creditbankacc_tf.setFont(new Font("Arial", Font.BOLD, 15));

        creditbalanceAmt_jl = new JLabel("Balance Amount :");
        creditbalanceAmt_jl.setBounds(30,310,190,20);
        creditbalanceAmt_jl.setFont(new Font("Arial", Font.BOLD, 17));

        creditbalanceAmt_tf = new JTextField();
        creditbalanceAmt_tf.setBounds(30,334,227,28);
        creditbalanceAmt_tf.setFont(new Font("Arial", Font.BOLD, 15));

        cvc_jl = new JLabel("CVC Number :");
        cvc_jl.setBounds(30,374,126,23);
        cvc_jl.setFont(new Font("Arial", Font.BOLD, 17));

        cvc_tf = new JTextField();
        cvc_tf.setBounds(30,398,227,32);
        cvc_tf.setFont(new Font("Arial", Font.BOLD, 15));

        Interestrate_jl = new JLabel("Interest Rate :");
        Interestrate_jl.setBounds(30,438,126,24);
        Interestrate_jl.setFont(new Font("Arial", Font.BOLD, 17));

        Interestrate_tf = new JTextField();
        Interestrate_tf.setBounds(30,462,227,32);
        Interestrate_tf.setFont(new Font("Arial", Font.BOLD, 15));

        expirationdate_jl = new JLabel("Expiration Date :");
        expirationdate_jl.setBounds(30,502,227,20);
        expirationdate_jl.setFont(new Font("Arial", Font.BOLD, 15));

        Year_Cbox1 = new JComboBox<String>(year1);
        Year_Cbox1.setBounds(30,526,65,32);

        Month_Cbox1 = new JComboBox<String>(month1);
        Month_Cbox1.setBounds(103,526,75,32);

        Day_Cbox1 = new JComboBox<String>(day1);
        Day_Cbox1.setBounds(196,526,62,32);

        AddcreditCard = new JButton("Add CreditCard");
        AddcreditCard.setBounds(272,526,139,32);

        AddcreditCard.setFocusable(false);
        AddcreditCard.setHorizontalTextPosition(JButton.CENTER);
        AddcreditCard.setVerticalTextPosition(JButton.BOTTOM);
        AddcreditCard.setFont(new Font("Arial",Font.BOLD,16));
        AddcreditCard.setForeground(new Color(53, 54, 50));
        AddcreditCard.setBackground(new Color(238,216,199));
        AddcreditCard.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        gotodebit_jb = new JButton("Go To DebitCard");
        gotodebit_jb.setBounds(20,605,136,32);
        gotodebit_jb.setFocusable(false);
        gotodebit_jb.setHorizontalTextPosition(JButton.CENTER);
        gotodebit_jb.setVerticalTextPosition(JButton.BOTTOM);
        gotodebit_jb.setFont(new Font("SansSerif",Font.BOLD,16));
        gotodebit_jb.setForeground(new Color(53, 54, 50));
        gotodebit_jb.setBackground(new Color(198,234,227));
        gotodebit_jb.setBorder(BorderFactory.createEtchedBorder());

        display1_jb = new JButton("Display");
        display1_jb.setBounds(207,609,85,32);
        display1_jb.setFocusable(false);
        display1_jb.setHorizontalTextPosition(JButton.CENTER);
        display1_jb.setVerticalTextPosition(JButton.BOTTOM);
        display1_jb.setFont(new Font("SansSerif",Font.BOLD,16));
        display1_jb.setForeground(new Color(53, 54, 50));
        display1_jb.setBackground(new Color(160,219,142));
        display1_jb.setBorder(BorderFactory.createEtchedBorder());

        clear1_jb = new JButton("Clear");
        clear1_jb.setBounds(338,605,89,32);
        clear1_jb.setFocusable(false);
        clear1_jb.setHorizontalTextPosition(JButton.CENTER);
        clear1_jb.setVerticalTextPosition(JButton.BOTTOM);
        clear1_jb.setFont(new Font("Arial",Font.BOLD,16));
        clear1_jb.setForeground(new Color(53, 54, 50));
        clear1_jb.setBackground(new Color(243,98,89));
        clear1_jb.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        cancel_jb = new JButton("Cancel CreditCard");
        cancel_jb.setBounds(488,605,157,32);
        cancel_jb.setFocusable(false);
        cancel_jb.setHorizontalTextPosition(JButton.CENTER);
        cancel_jb.setVerticalTextPosition(JButton.BOTTOM);
        cancel_jb.setFont(new Font("SansSerif",Font.BOLD,14));
        cancel_jb.setIconTextGap(-15);
        cancel_jb.setForeground(new Color(53, 54, 50));
        cancel_jb.setBackground(new Color(198,234,227));
        cancel_jb.setBorder(BorderFactory.createEtchedBorder());

       
        WithdrawMoney_jl = new JLabel("Withdraw Money");
        WithdrawMoney_jl.setBounds(45,8,237,36);
        WithdrawMoney_jl.setFont(new Font("Arial", Font.BOLD, 26));

        CardID_jl1 = new JLabel("Card ID :");
        CardID_jl1.setBounds(7,60,104,32);
        CardID_jl1.setFont(new Font("Arial", Font.BOLD, 18));

        CardID_tf1 = new JTextField();
        CardID_tf1.setBounds(7,92,226,32);
        CardID_tf1.setFont(new Font("Arial", Font.BOLD, 16));

        PinNumber_jl1 = new JLabel("PIN Number :");
        PinNumber_jl1.setBounds(7,140,140,32);
        PinNumber_jl1.setFont(new Font("Arial", Font.BOLD, 18));

        PinNumber_tf1 = new JTextField();
        PinNumber_tf1.setBounds(7,172,226,32);
        PinNumber_tf1.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "WithdrawalAmount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "WithdrawalAmount".
         */
        WithdrawalAmount_jl = new JLabel("Withdrawal Amount :");
        WithdrawalAmount_jl.setBounds(7,220,220,32);
        WithdrawalAmount_jl.setFont(new Font("Arial", Font.BOLD, 18));
        /*
         Here it creates a Jlabel with the label "WithdrawalAmount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "WithdrawalAmount".
         */
        WithdrawalAmount_tf = new JTextField();
        WithdrawalAmount_tf.setBounds(7,252,226,32);
        WithdrawalAmount_tf.setFont(new Font("Arial", Font.BOLD, 16));
        /*
         Here it creates a Jlabel with the label "WithdrawalAmount" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "WithdrawalAmount".
         */
        WithdrawalDate_jl = new JLabel("Withdrawal Date:");
        WithdrawalDate_jl.setBounds(7,300,202,32);
        WithdrawalDate_jl.setFont(new Font("Arial", Font.BOLD, 18));

        Year_Cbox = new JComboBox<String>(year);
        Year_Cbox.setBounds(7,332,65,32);

        Month_Cbox = new JComboBox<String>(month);
        Month_Cbox.setBounds(81,332,73,32);

        Day_Cbox = new JComboBox<String>(day);
        Day_Cbox.setBounds(163,332,58,32);

        Proceed_jb = new JButton("Proceed");
        Proceed_jb.setBounds(150,380,96,32);
        Proceed_jb.setFocusable(false);
        Proceed_jb.setHorizontalTextPosition(JButton.CENTER);
        Proceed_jb.setVerticalTextPosition(JButton.BOTTOM);
        Proceed_jb.setFont(new Font("Arial",Font.BOLD,16));
        Proceed_jb.setIconTextGap(-15);
        Proceed_jb.setForeground(new Color(53, 54, 50));
        Proceed_jb.setBackground(new Color(76,166,76));
        Proceed_jb.setBorder(BorderFactory.createEtchedBorder());

        goback_jb = new JButton("Go Back");
        goback_jb.setBounds(21,380,87,32);
        goback_jb.setFocusable(false);
        goback_jb.setHorizontalTextPosition(JButton.CENTER);
        goback_jb.setVerticalTextPosition(JButton.BOTTOM);
        goback_jb.setFont(new Font("Arial",Font.BOLD,16));
        goback_jb.setIconTextGap(-15);
        goback_jb.setForeground(new Color(53, 54, 50));
        goback_jb.setBackground(new Color(47, 203, 238));
        goback_jb.setBorder(BorderFactory.createEtchedBorder());
        /*
         Here it creates a Jlabel with the label "setCreditLimit" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "setCreditLimit".
         */
        setcreditLimit_jl = new JLabel("Add Credit Limit Details");
        setcreditLimit_jl.setBounds(31,12,266,38);
        setcreditLimit_jl.setFont(new Font("Arial", Font.BOLD, 19));
        /*
         Here it creates a Jlabel with the label "cardid_jl1" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "cardid_jl1".
         */
        cardid_jl1 = new JLabel("Card ID :");
        cardid_jl1.setBounds(31,84,85,32);
        cardid_jl1.setFont(new Font("Arial", Font.BOLD, 17));
        /*
         Here it creates a Jlabel with the label "cardid_jl1" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "cardid_jl1".
         */
        cardid_tf1 = new JTextField();
        cardid_tf1.setBounds(31,116,227,32);
        cardid_tf1.setFont(new Font("Arial", Font.BOLD, 15));
        /*
         Here it creates a Jlabel with the label "creditLimit" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "creditLimit".
         */
        creditlimit_jl = new JLabel("Credit Limit :");
        creditlimit_jl.setBounds(31,169,135,32);
        creditlimit_jl.setFont(new Font("Arial", Font.BOLD, 17));
        /*
         Here it creates a Jlabel with the label "creditLimit" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "creditLimit".
         */
        creditlimit_tf = new JTextField();
        creditlimit_tf.setBounds(31,201,227,32);
        creditlimit_tf.setFont(new Font("Arial", Font.BOLD, 15));
        /*
         Here it creates a Jlabel with the label "gracePeriod" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "graceperiod".
         */
        graceperiod_jl = new JLabel("Grace Period :");
        graceperiod_jl.setBounds(31,252,135,32);
        graceperiod_jl.setFont(new Font("Arial", Font.BOLD, 17));
        /*
         Here it creates a Jlabel with the label "gracePeriod" and sets its bounds, font, 
         text and background colors, and border,then assigned to the variable "graceperiod".
         */
        graceperiod_tf = new JTextField();
        graceperiod_tf.setBounds(31,284,227,32);
        graceperiod_tf.setFont(new Font("Arial", Font.BOLD, 15));
        /*
         Here it creates a JButton with the label "setCreditLimit" and sets its bounds, font, 
         text and background colors, and border. The button is then assigned to the variable "setCreditLimit".
         */
        setCreditLmt_jb = new JButton("Set Credit Limit");
        setCreditLmt_jb.setBounds(84,346,133,32);
        setCreditLmt_jb.setFocusable(false);
        setCreditLmt_jb.setHorizontalTextPosition(JButton.CENTER);
        setCreditLmt_jb.setVerticalTextPosition(JButton.BOTTOM);
        setCreditLmt_jb.setFont(new Font("SansSerif",Font.BOLD,14));
        setCreditLmt_jb.setIconTextGap(-15);
        setCreditLmt_jb.setForeground(new Color(53, 54, 50));
        setCreditLmt_jb.setBackground(new Color(198,234,227));
        setCreditLmt_jb.setBorder(BorderFactory.createEtchedBorder());

      
        JP1.add(Debit_JL);  

        JP1.add(CleintName_jl);
        JP1.add(ClientName_tf);

        JP1.add(CardID_jl);
        JP1.add(CardID_tf);

        JP1.add(IssuerBank_jl);
        JP1.add(IssuerBank_tf);

        JP1.add(BankAccount_jl);
        JP1.add(BankAccount_tf);

        JP1.add(PinNumber_jl);
        JP1.add(PinNumber_tf);

        JP1.add(BalanceAmount_jl);
        JP1.add(BalanceAmount_tf);

        JP1.add(DebitCard_jb);
        JP1.add(GoToCreditCard_jb);
        JP1.add(Clear_jb);
        JP1.add(Display_jb);
        JP1.add(withdraw_jb);
        
        //Adding ActionListener to all the buttons of the debitcard
        GoToCreditCard_jb.addActionListener(this);
        withdraw_jb.addActionListener(this);
        DebitCard_jb.addActionListener(this);
        Clear_jb.addActionListener(this);
        Display_jb.addActionListener(this);
        Proceed_jb.addActionListener(this);
        goback_jb.addActionListener(this);
        

        JP3.add(WithdrawMoney_jl);

        JP3.add(CardID_jl1);
        JP3.add(CardID_tf1);
        JP3.add(PinNumber_jl1);
        JP3.add(PinNumber_tf1);
        JP3.add(WithdrawalAmount_jl);
        JP3.add(WithdrawalAmount_tf);
        JP3.add(WithdrawalDate_jl);
        JP3.add(Year_Cbox);
        JP3.add(Month_Cbox);
        JP3.add(Day_Cbox);
        JP3.add(Proceed_jb);
        JP3.add(goback_jb);
           
        JP2.add(Credit_JL);

        JP2.add(CardId_jl);
        JP2.add(CardId_tf);

        JP2.add(creditclientname_jl);
        JP2.add(creditclientname_tf);

        JP2.add(creditissuerbank_jl);
        JP2.add(creditissuerbank_tf);

        JP2.add(creditbankacc_jl);
        JP2.add(creditbankacc_tf);

        JP2.add(creditbalanceAmt_jl);
        JP2.add(creditbalanceAmt_tf);

        JP2.add(cvc_jl);
        JP2.add(cvc_tf);

        JP2.add(Interestrate_jl);
        JP2.add(Interestrate_tf);

        JP2.add(expirationdate_jl);

        JP2.add(Year_Cbox1);
        JP2.add(Month_Cbox1);
        JP2.add(Day_Cbox1);

        JP2.add(AddcreditCard);
        JP2.add(gotodebit_jb);
        JP2.add(display1_jb);
        JP2.add(clear1_jb);
        JP2.add(cancel_jb);

        //Adding ActionListener to all the buttons of the CreditCard
        gotodebit_jb.addActionListener(this);
        AddcreditCard.addActionListener(this);
        gotodebit_jb.addActionListener(this);
        display1_jb.addActionListener(this);
        clear1_jb.addActionListener(this);
        cancel_jb.addActionListener(this);
        setCreditLmt_jb.addActionListener(this);

        
        JP2.add(Sub_JP2);
        Sub_JP2.add(setcreditLimit_jl);
        Sub_JP2.add(cardid_jl1);
        Sub_JP2.add(cardid_tf1);

        Sub_JP2.add(creditlimit_jl);
        Sub_JP2.add(creditlimit_tf);

        Sub_JP2.add(graceperiod_jl);
        Sub_JP2.add(graceperiod_tf);

        Sub_JP2.add(setCreditLmt_jb);

        Sub_JP2.setLayout(null);
        
        JF.add(JP1);
        // Setting Layout , visiblity according to the condition to true, false or null
        JP1.setLayout(null);
        // Setting Layout , visiblity according to the condition to true, false or null
        JF.setLayout(null);
        // Setting Layout , visiblity according to the condition to true, false or null
        JF.setVisible(true);

        JF.add(JP2);
        JF.add(JP3);
        // Setting Layout , visiblity according to the condition to true, false or null
        JP3.setLayout(null);
        JP2.setLayout(null);
        // Setting Layout , visiblity according to the condition to true, false or null
        JP3.setVisible(false);
        JP2.setVisible(false);
        JF.setResizable(false);
        // This is exit button of the gui
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // Here ActionPerformed is called whenever any button is clicked by the users
    public void actionPerformed(ActionEvent a){

        if(a.getSource() == DebitCard_jb)
        /*
        Here code first checks if the source of the action event is the "DebitCard_jb" button. If it is,
        it checks if any of the input fields are empty. If any fields are empty, it displays an error message.
         */

        {
            if(ClientName_tf.getText().isEmpty() ||
            CardID_tf.getText().isEmpty() ||
            IssuerBank_tf.getText().isEmpty() ||
            BankAccount_tf.getText().isEmpty() ||
            PinNumber_tf.getText().isEmpty())

            {  
                JOptionPane.showMessageDialog(JP1, "Ops Sorry!! Please Fill Your Details");
            }      
            else
            {
                try
                {
                    //Declearing and converting data in String from integer  to use  with getText() methods
                    int balanceAmount= Integer.parseInt(BalanceAmount_tf.getText());
                    //Declearing and converting data in String from integer  to use  with getText() methods
                    int cardId =Integer.parseInt(CardID_tf.getText());
                    //Declearing issuer bank and getting textfield
                    String issuerBank = IssuerBank_tf.getText();
                    //Declearing issuer bank and getting textfield
                    String bankAccount = BankAccount_tf.getText();
                    //Declearing issuer bank and getting textfield
                    String clientName = ClientName_tf.getText();
                    //Declearing and converting data in String from integer  to use  with getText() methods
                    int pinNumber = Integer.parseInt(PinNumber_tf.getText());
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(cardId);
                    String pin = String.valueOf(pinNumber);
                    String sumValues = "Balance Amount : " + balance + " \nCard ID : " + card + " \nIssuer Bank : " + issuerBank + " \nBank Account : " + bankAccount + " \nClient Name : " + clientName + " \nPin Number : " + pin;
                    // Object of DebitCard Class Name as obj1 is called with parameterValues.
                    obj1= new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                    /*
                     * Here it checks if the card ID is unique by iterating through an array of BankCard objects and comparing the card ID of each
                     * DebitCard object in the array to the card ID of the newly created DebitCard object.
                     * If the card ID is not unique, it displays an error message. If the card ID is unique, it adds the newly created
                     * DebitCard object to the BankCard array and displays a success message.
                     */
                    boolean isCardIdUnique = true;
                    for(BankCard obj1 : BankCardarray)   
                    {
                        if(obj1 instanceof DebitCard)
                        {
                            DebitCard dc_obj = (DebitCard) obj1;
                            if(obj1.getCardId() == cardId)
                            {
                                isCardIdUnique = false;
                                break;
                            }
                        }
                    }
                    /*
                     * Here in this block of code it checks some input validation using regular expressions to ensure that
                     * the client name and issuer bank name fields only contain letters and spaces
                     */
                    if (!clientName.matches("[a-zA-Z ]+") && (!issuerBank.matches("[a-zA-Z ]+"))) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT NAME  AND ISSUER BANK NAME", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!clientName.matches("[a-zA-Z ]+")) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT NAME !", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!issuerBank.matches("[a-zA-Z ]+")) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT ISSUER BANK NAME !", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    // After Checking everything Here obj1 of debitCard is added to bankcard array for withdrawing amount successfully
                    if(isCardIdUnique)
                    {
                        BankCardarray .add(obj1);
                        JOptionPane.showMessageDialog(null, "DEBIT CARD HAS BEEN ADDED SUCCESSFULLY! \n" + sumValues);
                    }
                    // If same Card id added twice it will show this message
                    else
                    {
                        JOptionPane.showMessageDialog(null, " The Debit Card ID is already added ");
                    }
                }
                // If try block doesnt match any of the conditions that we have provided then it will run this catch block and show this message
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(null, "Invalid Entry !! Please input the correct values !!", "Error", JOptionPane.ERROR_MESSAGE);
                }  
            }
        }
            /*
             * It is a part of an event listener for a "gotodebit_jb" button. When the button is clicked, 
             * it sets the visibility of JP1 and JP2 panels, and adjusts the size of the JFrame.
             */
        if(a.getSource() == gotodebit_jb )
        {
            JP1.setVisible(true);
            JP2.setVisible(false);
            JF.setSize(904,553);
        }
        /*
         Here code first checks if the source of the action event is the "Proceed_jb" button. If,
        it checks  any of the input fields are empty, it displays an error message.
        */
        if (a.getSource() == Proceed_jb)
        {   
            if(PinNumber_tf1.getText().isEmpty() ||
            WithdrawalAmount_tf.getText().isEmpty()||
            Year_Cbox.getSelectedItem().equals("Year") ||
            Month_Cbox.getSelectedItem().equals("Month") ||
            Day_Cbox.getSelectedItem().equals("Day")||
            CardID_tf1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "CANNOT PROCEED, PLEASE ADD DEBITCARD FIRST", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {

                try 
                {
                    int cardId = Integer.parseInt(CardID_tf1.getText());
                    int withdrawalamount = Integer.parseInt(WithdrawalAmount_tf.getText());
                    String day = (String) Day_Cbox.getSelectedItem();  
                    String month = (String) Month_Cbox.getSelectedItem();
                    String year = (String) Year_Cbox.getSelectedItem();
                    String withdrawaldate = day + "-" + month + "-" + year;
                    int pinNumber = Integer.parseInt(PinNumber_tf1.getText());
                    /*
                     * Here it checks if the card ID is  found by iterating through an array of BankCard objects and comparing the card ID of each
                     * DebitCard object in the array to the card ID of the newly created DebitCard object.
                     * If the card ID is not found, it displays an error message. If the card ID is unique, it adds the newly created
                     * DebitCard object to the BankCard array and displays a success message.
                     */
                    boolean isCardIdFound = false;
                    for (BankCard bc : BankCardarray) {
                        if (bc instanceof DebitCard) {
                            DebitCard dc = (DebitCard) bc;
                            if (dc.getCardId() == cardId) {
                                if (dc.getPinNumber() == pinNumber) {
                                    dc.withdraw(withdrawalamount, withdrawaldate, pinNumber);
                                    isCardIdFound = true;
                                    JOptionPane.showMessageDialog(null, "WITHDRAWAL SUCCESSFUL!", "Message", JOptionPane.INFORMATION_MESSAGE);
                                } else if(dc.getPinNumber() != pinNumber) {
                                    JOptionPane.showMessageDialog(null, "Invalid pin", "Message", JOptionPane.ERROR_MESSAGE);
                                }
                            }else
                            {
                                JOptionPane.showMessageDialog(null, "CARD NOT FOUND!", "Message", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                // If try block doesnt match any of the conditions that we have provided then it will run 
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(null, "Invalid !! Please input the correct values.");
                }  
            }   
        }
            /*
             * It is a part of an event listener for a "proceed" button. When the button is clicked, 
             * it sets the visibility of JP1 and JP3 panels, and adjusts the size of the JFrame.
             */
        if(a.getSource() == withdraw_jb )
        {
            JP1.setVisible(false);
            JP3.setVisible(true);
            JF.setSize(319,474);
        }
           
        if(a.getSource() == Display_jb)
        /*
        Here code first checks if the source of the action event is the "Display_jb" button. If,
        it checks  any of the input fields are empty, it displays an error message.
        */
        {
            if(ClientName_tf.getText().isEmpty() ||
            CardID_tf.getText().isEmpty() ||
            IssuerBank_tf.getText().isEmpty() ||
            BankAccount_tf.getText().isEmpty() ||
            PinNumber_tf.getText().isEmpty())

            {
                JOptionPane.showMessageDialog(JP1, "Ops Sorry!! Please Fill Your Details");
            }

            else
            {
                try
                {
                    //Declearing and converting data in String from integer  to use  with getText() method
                    int balanceAmount= Integer.parseInt(BalanceAmount_tf.getText());
                    int cardId =Integer.parseInt(CardID_tf.getText());
                    //Declearing  bankAccount and getting textfield
                    String issuerBank = IssuerBank_tf.getText();
                    //Declearing  clientName and getting textfield
                    String bankAccount = BankAccount_tf.getText();
                    String clientName = ClientName_tf.getText();
                    int pinNumber = Integer.parseInt(PinNumber_tf.getText());
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(cardId);
                    String pin = String.valueOf(pinNumber);
                    String sumValues = "Balance Amount : " + balance + " \nCard ID : " + card + " \nIssuer Bank : " + issuerBank + " \nBank Account : " + bankAccount + " \nClient Name : " + clientName + " \nPin Number : " + pin;
                    obj1= new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                    for(BankCard obj1 : BankCardarray){
                        if(obj1 instanceof DebitCard){
                            DebitCard Debitdisplay_obj = (DebitCard) obj1;
                            Debitdisplay_obj.display();
                        }
                    }
                }
                // If try block doesnt match any of the conditions that we have provided then it will run
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(JP1, "Invalid !! Please input the currect values.");
                }
            }
        }
        /*
             * It is a part of an event listener for a "goback" button. When the button is clicked, 
             * it sets the visibility of JP1 and JP3 panels, and adjusts the size of the JFrame.
             */
        if(a.getSource() == goback_jb )
        {
            JP1.setVisible(true);
            JP3.setVisible(false);
            JF.setSize(904,553);
        }
        //Clearning DebitCard Card TextFields using event handler Clear-jb button
        if(a.getSource() == Clear_jb)
        {
            ClientName_tf.setText("");
            CardID_tf.setText("");
            CardID_tf1.setText("");
            IssuerBank_tf.setText("");
            BankAccount_tf.setText("");
            PinNumber_tf.setText("");
            PinNumber_tf1.setText("");
            BalanceAmount_tf.setText("");
            WithdrawalAmount_tf.setText("");
        }
        /*
         * It is a part of an event listener for a "GoToCreditCard_jb" button. When the button is clicked, 
        * it sets the visibility of JP1 and JP2 panels, and adjusts the size of the JFrame.
        */
        if(a.getSource()== GoToCreditCard_jb)
        {
            JP1.setVisible(false);
            JP2.setVisible(true);
            JF.setSize(689,682);
        }

        if(a.getSource() == AddcreditCard)
        /*
        Here code first checks if the source of the action event is the "AddcreditCard_jb" button. If,
        it checks  any of the input fields are empty, it displays an error message.
        */
        {  
            if(CardId_tf.getText().isEmpty()||
            creditclientname_tf.getText().isEmpty()||
            creditissuerbank_tf.getText().isEmpty()||
            creditbankacc_tf.getText().isEmpty()||
            cvc_tf.getText().isEmpty()||
            Year_Cbox1.getSelectedItem().equals("Year1") ||
            Month_Cbox1.getSelectedItem().equals("Month1")||
            Day_Cbox1.getSelectedItem().equals("Day1")||
            Interestrate_tf.getText().isEmpty())
            
            {
                JOptionPane.showMessageDialog(JP2, "Ops Sorry!! Please Fill Your Details");
            }
            else{
                try
                {    
                    //Declearing and converting data in String from integer  to use  with getText() 
                    int cardId = Integer.parseInt(CardId_tf.getText());
                    String clientName = creditclientname_tf.getText();
                    String issuerBank = creditissuerbank_tf.getText();
                    int cvcNumber = Integer.parseInt(cvc_tf.getText());
                    //Declearing and converting data in String from integer  to use  with getText() 
                    Double interestRate = Double.parseDouble(Interestrate_tf.getText());
                    String bankAcc =creditbankacc_tf.getText();
                    //Declearing and converting data in String from integer  to use  with getText() 
                    int balanceAmount =Integer.parseInt(creditbalanceAmt_tf.getText()) ;
                    String bankAccount = creditbankacc_tf.getText();

                    String InterestRate = String.valueOf(interestRate);
                    String card = String.valueOf(cardId);
                    String CVC = String.valueOf(cvcNumber);
                    String balance = String.valueOf(balanceAmount);

                    String year1 = (String) Year_Cbox1.getSelectedItem();
                    String month1 = (String) Month_Cbox1.getSelectedItem();
                    String day1 = (String) Day_Cbox1.getSelectedItem();
                    String expirationDate = year1 +"-" + month1 + "-"+ day1;
                    String sumValues1 =  "Card ID : " + card +  " \nClient Name : "+ clientName  + " BankAccount : " + bankAccount + "\n Balance Amount : " + balance +" \nIssuer Bank : " + issuerBank + " \ncvc Number : " + CVC + "\n interestRate" + InterestRate  + "\n expiration date :" +expirationDate;
                    // calling object of CreditCard as obj2 with parameter value
                    obj2= new CreditCard(cardId, clientName, issuerBank, bankAccount ,balanceAmount, cvcNumber, interestRate, expirationDate);
                    /*
                     * Here it checks if the card ID is exists by iterating through an array of BankCard objects and comparing the card ID of each
                     * CreditCard object in the array to the card ID of the newly created CreditCard object.
                     * If the card ID is not found, it displays an error message. If the card ID is exists, it adds the newly created
                     * DebitCard object to the BankCard array and displays a success message.
                     */
                    boolean isCardIdexists = true;
                    for(BankCard obj2 : BankCardarray)   // downcasting is done here using for each loop
                    {
                        if(obj2 instanceof CreditCard)
                        {
                            CreditCard cc_obj = (CreditCard) obj2;
                            if(obj2.getCardId() == cardId)
                            {
                                isCardIdexists = false;
                                break;
                            }
                        }
                    }
                    /*
                     * Here in this block of code it checks some input validation using regular expressions to ensure that
                     * the client name and issuer bank name fields only contain letters and spaces
                     */
                    if (!clientName.matches("[a-zA-Z ]+") && (!issuerBank.matches("[a-zA-Z ]+"))) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT NAME  AND ISSUER BANK NAME", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!clientName.matches("[a-zA-Z ]+")) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT NAME !", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!issuerBank.matches("[a-zA-Z ]+")) {
                        JOptionPane.showMessageDialog(null, "PLEASE  ENTER CORRECT ISSUER BANK NAME!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    // After Checking everything Here obj2 of CreditCard is added to bankcard array for Adding CreditCard successfully
                    if(isCardIdexists)
                    {
                        BankCardarray .add(obj2);
                        JOptionPane.showMessageDialog(null, "CREDIT CARD HAS BEEN ADDED SUCCESSFULLY! \n" + sumValues1);
                    }
                    else
                    // If same Card id added twice it will show this message
                    {
                        JOptionPane.showMessageDialog(null, " The Credit Card ID is already added ");
                    }
                }
                 // If try block doesnt match any of the conditions that we have provided then it will run this catch block and show this message
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Invalid !! Please input the correct values !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(a.getSource() == display1_jb)
        /*
        Here code first checks if the source of the action event is the "display1_jb" button. If,
        it checks  any of the input fields are empty, it displays an error message.
        */
        {
            if(CardId_tf.getText().isEmpty()||
            creditclientname_tf.getText().isEmpty()||
            creditissuerbank_tf.getText().isEmpty()||
            creditbankacc_jl.getText().isEmpty()||
            cvc_tf.getText().isEmpty()||
            creditbalanceAmt_tf.getText().isEmpty()||
            Interestrate_tf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Ops Sorry!! Please Fill Your Details");
            }
            else{
                try
                {    
                    //Declearing and converting data in String from integer  to use  with getText() method
                    int cardId = Integer.parseInt(CardId_tf.getText());
                    String clientName = creditclientname_tf.getText();
                    String issuerBank = creditissuerbank_tf.getText();
                    int cvcNumber = Integer.parseInt(cvc_tf.getText());
                    Double interestRate = Double.parseDouble(Interestrate_tf.getText());
                    String bankAcc =creditbankacc_tf.getText();
                    int balanceAmount =Integer.parseInt(creditbalanceAmt_tf.getText()) ;
                    String bankAccount = creditbankacc_tf.getText();

                    String InterestRate = String.valueOf(interestRate);
                    String card = String.valueOf(cardId);
                    String CVC = String.valueOf(cvcNumber);
                    String balance = String.valueOf(balanceAmount);

                    String year1 = (String) Year_Cbox1.getSelectedItem();
                    String month1 = (String) Month_Cbox1.getSelectedItem();
                    String day1 = (String) Day_Cbox1.getSelectedItem();

                    String expirationDate = year +"_" + month + "-"+ day;
                    String sumValues1 =  "Card ID : " + card +  " \nClient Name : "+ clientName  +"\n balance Amount"+balance+" \nIssuer Bank : " + issuerBank + " \ncvc Number : " + CVC + "\n interestRate"+ InterestRate;
                    obj2= new CreditCard(cardId, clientName, issuerBank, bankAccount ,balanceAmount, cvcNumber, interestRate, expirationDate);
                    // Here Instanceof is used to declear obj2 is the instance object of creditcard
                    for(BankCard obj2 : BankCardarray){
                        if(obj2 instanceof CreditCard){
                            CreditCard Creditdisplay_obj = (CreditCard) obj2;
                            Creditdisplay_obj.display();
                        }
                    }
                }
                catch(NumberFormatException nfe){

                    JOptionPane.showMessageDialog(null, "Invalid !! Please input the correct values.");

                }
            }
        }
        /*
            Here code first checks if the source of the action event is the "setCreditLimit_jb" button. If,
            it checks  any of the input fields are empty, it displays an error message.
             */
        if (a.getSource() == setCreditLmt_jb) {
            if (cardid_tf1.getText().isEmpty() || creditlimit_tf.getText().isEmpty() || graceperiod_tf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ops Sorry!! Please Fill Your Details");
            } else {
                try {
                    int cardId = Integer.parseInt(cardid_tf1.getText());
                    double CreditLimit = Double.parseDouble(creditlimit_tf.getText());
                    int GracePeriod = Integer.parseInt(graceperiod_tf.getText());

                    boolean isCardIdEqual = false;
                    for (BankCard obj2 : BankCardarray) {
                        if (obj2 instanceof CreditCard) {
                            CreditCard object = (CreditCard) obj2;
                            if (object.getCardId() == cardId) 
                            {
                                if(CreditLimit <= object.getBalanceAmount()*2.5)
                                {
                                    object.setCreditLimit(CreditLimit, GracePeriod);
                                    isCardIdEqual = true;
                                    JOptionPane.showMessageDialog(null, "YOUR CREDIT LIMIT IS SET SUCCESSFULLY", "Message", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "YOUR CREDIT LIMIT SHOULD BE LESS THAN OR EQUAL Balance AMOUNT", "Message", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                        if(!isCardIdEqual)
                        {
                            JOptionPane.showMessageDialog(null, "CARD NOT FOUND!", "Message", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Invalid !! Please input the correct values.");
                }
            }
        }

        if(a.getSource()== cancel_jb)
        /*
        Here code first checks if the source of the action event is the "cancel_jb" button. If,
        it checks  any of the input fields are empty, it displays an error message.
             */
        {
            if(cardid_tf1.getText().isEmpty() ||
            creditlimit_tf.getText().isEmpty()||
            graceperiod_tf.getText().isEmpty()||
            CardId_tf.getText().isEmpty()||
            creditclientname_tf.getText().isEmpty()||
            creditissuerbank_tf.getText().isEmpty()||
            creditbankacc_jl.getText().isEmpty()||
            cvc_tf.getText().isEmpty()||
            creditbalanceAmt_tf.getText().isEmpty()||
            Interestrate_tf.getText().isEmpty())

            {
                JOptionPane.showMessageDialog(null, "Ops Sorry!! Please Fill Your Details");
            }

            else
            {
                try

                {
                    int cardId = Integer.parseInt(CardId_tf.getText());
                    double CreditLimit = Double.parseDouble(creditlimit_tf.getText());
                    int GracePeriod = Integer.parseInt(graceperiod_tf.getText());
                    boolean isCardIdEqual = false;                    
                    String message = "YOUR CREDIT HASBEEN SUCCESSFUL\n Credit Limit: " +CreditLimit+ "\nGrace Period: "+GracePeriod;
                    /*
                     * Here it checks if the card ID  iterating through an array of BankCard objects and comparing the card ID of each
                     * CreditCard object in the array to the card ID of the newly created CreditCard object.
                     * If the card ID is not unique, it displays an error message. If the card ID is unique, it adds the newly created
                     * DebitCard object to the BankCard array and displays a success message.
                     */
                    for (BankCard Credit : BankCardarray) {
                        if (Credit instanceof CreditCard) {
                            CreditCard object_c = (CreditCard) Credit;
                            if (object_c.getCardId() == cardId) {
                                object_c.cancelCreditCard();
                                isCardIdEqual = true;
                                break;
                            }
                        }
                    }
                    // If cardidequql to true then creditLimit will be set here
                    if (isCardIdEqual) {
                        JOptionPane.showMessageDialog(null, "YOUR CREDITCARD HAS BEEN SUCCESSFUL CANCEL!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "CARD NOT FOUND!", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                // If try block doesnt match any of the conditions that we have provided then it will run
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(null, "Invalid !! Please input the correct values.");
                }
            }  
        }                         
        //Clearning Creditcard Card using button
        if(a.getSource() == clear1_jb)
        {
            CardId_tf.setText("");
            creditclientname_tf.setText("");
            creditissuerbank_tf.setText("");
            creditbankacc_tf.setText("");
            creditbalanceAmt_tf.setText("");
            cvc_tf.setText("");
            Interestrate_tf.setText("");
            cardid_tf1.setText("");
            creditlimit_tf.setText("");
            graceperiod_tf.setText("");
            Year_Cbox1.setSelectedIndex(0);
            Month_Cbox1.setSelectedIndex(0);
            Day_Cbox1.setSelectedIndex(0);
        }
    }
    // Creating the Main Method
    public static void main(String args []){
        // Calling The Constructor Bank_GUI inside the main Method
        new Bank_GUI();
    }
}        
