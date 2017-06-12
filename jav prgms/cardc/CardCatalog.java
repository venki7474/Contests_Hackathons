public class Menu
{
    public static void main(String[] args)
    {
        CardCatalog cc = new CardCatalog();
        cc.addACard();
        cc.printTheCatalog();
    }




public class Card
{
    // instance variables - replace the example below with your own
    public String author;
    public String title;
    public String subject;

    public Card(String title,String author,String subject )
    {
      this.author=author;
      this.title=title;
      this.subject=subject;
      //System.out.println(title);
      //System.out.println(author);
      //System.out.println(subject);
     
    }
}

import java.util.*; 

public class CardCatalog
{
    String theTitle;
    String theSubject;
    String theAuthor;
    static int index=0;
    static int i=10;
    Card[] card= new Card[i];
    
    public void addACard()
    {
      Scanner sA =new Scanner(System.in);
      theAuthor = sA.nextLine();
      
      Scanner sT = new Scanner(System.in);
      theTitle = sT.nextLine();
      
      Scanner sS = new Scanner(System.in);
      theSubject = sS.nextLine();
      
      card[index] = new Card(theTitle,theAuthor,theSubject);
      index++;
      
        
    }
    
    public void printTheCatalog()
    {
        for(int j=0;i<index;i++)
        {
            System.out.println(card[j].title + " " + card[j].author + " " +card[j].subject);
        }
        
        
    }
    
    public void  getATitle()
    {
        
    }
    
    public void getAnAuthor()
    {
        
    }
    
    public void getSubject()
    {
        
    }
    public void removeATitle()
    {
        
    }
    
}
}
