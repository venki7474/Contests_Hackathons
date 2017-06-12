import java.util.*; 
import java.io.*;


class Card
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
      System.out.println(title);
      System.out.println(author);
      System.out.println(subject);
     
    }
}



class CardCatalog
{
  Card[] theTitle;
  Card[] theAuthor;
  Card[] theSubject;
  int index=0;

  CardCatalog()
  {
    theTitle = Card[10];
    theAuthor = Card[10];
    theSubject = Card[10];
  }
  
  public void addACard(Crad[] crd)
  {
    theTitle = crd;
    theAuthor = crd;
    theSubject = crd;
  }
    
    
    
    
 public void printTheCatalog()
    {
        for(int j=0;j<index;j++)
        {
            System.out.println(card[j].title + " " + card[j].author + " " +card[j].subject);
        }
        
        
    }
    
    public void  getATitle(String s_Title)
    {
        for(int j=0;j<index;j++)
        {
            if(card[j].title.equals(s_Title))
            {
                System.out.println(card[j].title);
                System.out.println(card[j].author);
                System.out.println(card[j].subject);
            }
        }
        
        
    }
    
    public void getAnAuthor(String s_Author)
    {
        for(int j=0;j<index;j++)
        {
            if(card[j].author.equals(s_Author))
            {
                System.out.println(card[j].author);
            }
        }   
        
    }
    
    public void getSubject(String s_Subject)
    {
        for(int j=0;j<index;j++)
        {
            if(card[j].subject.equals(s_Subject))
            {
            System.out.println(card[j].subject);
            }
        }
        
        
    }

    
    public void removeATitle(String rmv_Title)
    {
        for(int j=0;j<index;j++)
        {
            if(card[j].title.equals(rmv_Title))
            {
                card[j].title = " ";
                
                System.out.println("enterd title book is removed");
            }
        }
        
    }
    
}

public class Menu
{
 public static void main(String[] args)
    {
       Card[] card = new Card[3];

         card[0] = new Card("Let us c","yashwanth","C language");
       
         card[1] = new Card("Think Java","Allen B.Downey","Java");
        
         card[2] = new Card("java:the complete reference","Herbert Schildt","Basic java");

        CardCatalog cc = new CardCatalog();
        Card cd;
        cc.addACard(card[0]);
        cc.addACard(card[1]);
        cc.addACard(card[2]);


        //cc.printTheCatalog();
        //System.out.println("enter ther title to be searchd");
       // Scanner s_Titile = new Scanner(System.in);


    }

}
