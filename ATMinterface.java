 
import java.util.Scanner;

class Bank{ 
    int accbalance=50000; 
    int amount; 
    String tranHist="Transaction History = \n"; 
    int tran=0; 
    String user_name,passwd; 

    public void register() { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Options \n 1.Register \n 2.Exit"); 
    int x=sc.nextInt(); 

    if(x==1){     
      System.out.println("Enter your name : "); 
    String name=sc.next();
      System.out.println("Please enter user name = "); 
    user_name=sc.next(); 
      System.out.println("Enter password = "); 
    passwd=sc.next(); 
      System.out.println("Enter account number = ");
    int accNo=sc.nextInt();
      System.out.println("Successfully Register ");
            } 
    else{ 
      System.out.println("Thank you successfuly exit"); 
        }     
                            } 

    public int login() { 
    int result=0; 
    Scanner sc=new Scanner(System.in); 
      System.out.println("Select by your choice \n 1.Login \n 2.Exit");
    int x=sc.nextInt(); 

    if(x==1){ 
      System.out.println("Enter User name = ");
    String Uname=sc.next(); 

    if(Uname.equals(user_name)) {
      System.out.println("Enter password = "); 
    String password=sc.next();
    if(password.equals(passwd)){
      System.out.println("Login Succesfully"); 
    result=1; 
    }          
    }
    else{ 
      System.out.println("Enter correct User name "); 
        }          
    } 
    return result;
    } 

    void Withdraw(){ 
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter withdraw amount = "); 
        amount=sc.nextInt(); 

        if(accbalance > amount){ 
            accbalance=accbalance-amount; 
            String str=amount+" Rs Withdraw \n"; 
            System.out.println("Successfully "+str); 
            tranHist=tranHist.concat(str); 
            tran++;     
        } 
        else{ 
            System.out.println("Insufficient balance ");  
        }         
    } 

    void Transaction(){ 
        if(tran==0){ 
            System.out.println("Empty \n"); 
        } 
        else{ 
            System.out.println(tranHist);  
        } 
    }

    void Deposit() { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Deposit Amount = "); 
        int amount=sc.nextInt(); 
        accbalance=accbalance+amount; 
        String str=amount+" Rs Deposit \n"; 
        System.out.println("Successfully "+str); 
        tranHist=tranHist.concat(str); 
        tran++;    
    }

    void Transfer() { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Transfer person name = "); 
        String Tname=sc.next(); 
        System.out.println("Enter Transfer Amount = "); 
        int amount=sc.nextInt();
        if(accbalance > amount){ 
            accbalance=accbalance - amount; 
            String str=amount + " Rs Tranfer to "+Tname +"\n"; 
            System.out.println("Successfully "+str); 
            tranHist=tranHist.concat(str); 
            tran++;                    
        } 
        else{ 
            System.out.println("Insufficient balance ");  
        }         
    } 

    void balance(){ 
        System.out.println("Account balance = "+accbalance+"\n"); 
    } 
}

public class ATMinterface { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();
        int ch,result=0;
        do {
        // System.out.println("\n");
         System.out.println("**** Welcome to ATM *****");
         System.out.println("Choose the Following Option");
        System.out.println("1.Register");
        System.out.println(" NOTE : Register first to access below features ");
        System.out.println("2.Login");
         System.out.println("3.Withdraw");
        System.out.println("4.Transaction History");
         System.out.println("5.Deposit");
         System.out.println("6.Transfer");
         System.out.println("7.Check Balance");
        System.out.println("8.Exit");
        ch=sc.nextInt();
        switch(ch){ 
            case 1: 
                bank.register(); 
                break; 
            case 2: 
                result=bank.login(); 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                break; 
            case 3: 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                else{ 
                    bank.Withdraw(); 
                } 
                break; 
            case 4: 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                else{ 
                    bank.Transaction(); 
                } 
                break; 
            case 5: 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                else{ 
                    bank.Deposit(); 
                } 
                break; 
            case 6: 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                else{ 
                    bank.Transfer(); 
                } 
                break; 
            case 7: 
                if(result==0){ 
                    System.out.println("Please register first."); 
                } 
                else{ 
                    bank.balance(); 
                } 
                break; 
            case 8: 
                System.out.println("You Successfully Exit"); 
                break; 
            default: 
                System.out.println("Invalid option"); 
        } 
    }while(ch!=8); 
} 

}
   

   