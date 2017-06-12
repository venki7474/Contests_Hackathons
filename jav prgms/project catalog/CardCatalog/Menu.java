import java.util.Scanner;

public class Menu {
  static int y;    
  /**
  *this is the main method by venki
  *
  *
  */
  public static void main(String[] args) {
    String srchTitle;
    String srchAuthor;
    String srchSubject;
    Card[] card = new Card[5];
    card[0] = new Card("Let us c" , "yashwanth" , "c");
    card[1] = new Card("Let us Java" , "Allen B.Downey" , "Java");
    card[2] = new Card("The complete reference for Java" , "Herbert Schildt" , "Java");
    card[3] = new Card("Let us c" , "Herbert Schildt" , "c");
    card[4] = new Card("Algorithms" , "Thomas" , "Data Structures");
    CardCatalog cc = new CardCatalog();
    // Card cd;
    for (int i = 0; i < 5; i++) {
      cc.addACard(card[i]);
    }
    do {
      System.out.println("enter 1 to get by the title:");
      System.out.println("enter 2 to get by the Author:");
      System.out.println("enter 3 to get by the Subject:");
      System.out.println("enter 4 to remove the title:");
      System.out.println("enter 5 to print the catalog:");
      Scanner sc = new Scanner(System.in);
      int caseNum = sc.nextInt();
      switch (caseNum) {
        case 1: System.out.println("enter the title to be searchd");
          Scanner s0 = new Scanner(System.in);
          srchTitle = s0.nextLine();
          Card[] arTitle = new Card[10];
          arTitle = cc.getATitle(srchTitle);
          for (int j = 0; j < 1; j++) {
            System.out.println("Title:" + arTitle[j].title);
            System.out.println("Author:" + arTitle[j].author);
            System.out.println("Subject:" + arTitle[j].subject);
          }
                   break;
        case 2: System.out.println("enter the author to be searchd");
          Scanner s1 = new Scanner(System.in);
          srchAuthor = s1.nextLine();
          Card[] anAuthor = new Card[10];
          anAuthor = cc.getAnAuthor(srchAuthor);
          //printCard(anAuthor[]);
          for (int j = 0; j < 5; j++) {
            System.out.println("Title:" + anAuthor[j].title);
            System.out.println("Author:" + anAuthor[j].author);
            System.out.println("Subject:" + anAuthor[j].subject);
          }
                    break;
        case 3: System.out.println("enter the subject to be searchd");
          Scanner s2 = new Scanner(System.in);
          srchSubject = s2.nextLine();
          Card[] arSubject = new Card[10];
          arSubject = cc.getSubject(srchSubject);
                    //printCard(aSubject[]);
          for (int j = 0; j < 5; j++) {
            System.out.println("Title:" + arSubject[j].title);
            System.out.println("Author:" + arSubject[j].author);
            System.out.println("Subject:" + arSubject[j].subject);
          }
                    break;
        case 4: cc.printAll();
          System.out.println("enter the book number to be deleted");
          Scanner sc1 = new Scanner(System.in);
          int rmvNumber = sc1.nextInt();
          if (rmvNumber <= 5) {
            cc.removeATitle(card[rmvNumber - 1]);
          } else {
            System.out.println("enter the valid book number");
          }
                break;
        case 5: cc.printTheCatalog();
                break;
        default : System.out.println("enter the valid number");
      }
      System.out.println("Enter 0 to exit and 1 to continue:");
      Scanner sc1 = new Scanner(System.in);
      y = sc1.nextInt();
    } while (y != 0 && y == 1);
  }
}
