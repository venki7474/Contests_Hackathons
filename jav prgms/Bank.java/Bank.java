
public class Bank
{
    // instance variables - replace the example below with your own
    private String name;
    private int accountNumber;
    private String address;
    private int balance;


   
    public Bank(String theName,String adrs,int acNum )
    {
        name=theName;
        accountNumber=acNum;
        address = adrs;
        balance = 500;
        
    }
    
    public void transaction(int amount,String date,String time)
    {
        System.out.print("Date is:" +date);
        System.out.println(" Time:" +time);
        if(amount >0)
        {
            System.out.println("credited amount:" +amount);
        }
        else
        {
            System.out.println("debited amount:" +amount);
        }
        balance = balance + amount;
        
        
        System.out.println("balance is :" +balance);
        
    }
        
        
   
    public static void main(String[] args)
    {
        Bank account =new Bank("venkatesh","hyderabad",123456789);
        account.transaction(-500,"10/08/15" ,"15:00");
    }
}
