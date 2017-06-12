
public class Cart
{
    // instance variables - replace the example below with your own
    private String items;
    private int CostOfItems;
    private int TotalAmount;
    private int NoOfItems;

    /**
     * Constructor for objects of class Cart
     */
    public Cart()
    {
       items="";
       CostOfItems=0;
       TotalAmount=0;
       NoOfItems=0;
       
    }
    
    public void addToCart(String products,int amount)
    {
        items=items + products + " ";
        CostOfItems=CostOfItems+amount;
        NoOfItems++;
    }
    public void removeFromCart(String product,int amount) 
    {
        items=items.replace(product +" ","");
        CostOfItems=CostOfItems - amount;
        NoOfItems--;
    }
    public void invoice()
    {
        TotalAmount=CostOfItems;
        System.out.println("----------INVOICE------------");
        System.out.println("No.Of Items are:            "+NoOfItems);
        System.out.println("products are:               " +items);
        System.out.println("-----------------------------");
        System.out.println("Total:                     "+TotalAmount);
    }
    

    public static void main(String[] args)
    {
        Cart crt = new Cart();
        
        crt.addToCart("shirt",500);
        crt.addToCart("jeans",1000);
        crt.addToCart("shoes",3000);
        crt.addToCart("T-shirts",1500);
        crt.removeFromCart("shirt",500);
        
        crt.invoice();
    }
        
   
        
    
    
}
