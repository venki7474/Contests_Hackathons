import java.util.Scanner;
/** 
*This is a cardcatalog class that which contains all the methods.
*@param theTitle theTitle        
*@param theAuthor theAuthor 
*@param theSubject theSubject 
*/
class CardCatalog {
  private Card[] theTitle;
  private Card[] theAuthor;
  private Card[] theSubject;
  private static int index = 0;
  private int size = 10;
  //public int count=0;
  /**
  *this is the cardcatalog constructor.
  */
  CardCatalog() {
    theTitle = new Card[size];
    theAuthor = new Card[size];
    theSubject = new Card[size];
  }
  /**
  *addAcard metod is for adding the cards to the arrays
  *@param crd is the passed card.
  */
  public void addACard(final Card crd) {
    theTitle[index] = crd;
    theAuthor[index] = crd;
    theSubject[index] = crd;
    index++;
  }
  /**
  *printAll method is used to print the card content.
  */
  public void printAll() {
    for (int j = 0; j < 5; j++) {
      int cardNumber;
      cardNumber = j;
      cardNumber++;
      System.out.println("==================================");
      System.out.println(cardNumber + "." + "Title:" + theTitle[j].title);
      System.out.println("Author:" + theTitle[j].author);
      System.out.println("Subject:" + theTitle[j].subject);
    }
  }
  /**
  *this method is used to print the whole catalog.
  */
  public void printTheCatalog() {
    System.out.println("Enter 1 to get by Title.");
    System.out.println("Enter 2 to get by Author.");
    System.out.println("Enter 3 to get by Subject.");
    Scanner sc = new Scanner(System.in);
    int caseNumber = sc.nextInt();
    switch (caseNumber) {
      case 1:
        for (int j = 0; j < index; j++) {
          int titleNumber;
          titleNumber = j;
          titleNumber++;
          System.out.println(titleNumber + "." + "Title:" + theTitle[j].title);
          System.out.println("Author:" + theTitle[j].author);
          System.out.println("Subject:" + theTitle[j].subject);
          System.out.println("=====================================");
        }
        break;
      case 2:
        for (int j = 0; j < index; j++) {
          int authorNumber;
          authorNumber = j;
          authorNumber++;
          System.out.println(authorNumber + "." + "Author:" + theAuthor[j].author);
          System.out.println("Title:" + theAuthor[j].title);
          System.out.println("Subject:" + theAuthor[j].subject);
          System.out.println("===================================");
        }
        break;
      case 3:
        for (int j = 0; j < index; j++) {
          int subjectNumber;
          subjectNumber = j;
          subjectNumber++;
          System.out.println(subjectNumber + "." + "Subject:" + theSubject[j].subject);
          System.out.println("Author:" + theSubject[j].title);
          System.out.println("Subject:" + theSubject[j].author);
          System.out.println("====================================");
        }
        break;
      default: System.out.println("invalid option");
    }
  }
  /**
  *The method getATitle gives the book details based upon the search word.
  *@param sTitle is passed to the method  to get the details based upon the search word.
  *@return Card[] the return type is of card array.
  */
  public Card[] getATitle(final String searchTitle) {
    int countTitles = 0;
    int newTitleArrIndex = 0;
    Card[] crdTitle = new Card[10];
    for (int j = 0; j < index; j++) {
      if (theTitle[j].title.equalsIgnoreCase(searchTitle)) {
        crdTitle[newTitleArrIndex] = theTitle[j];
        newTitleArrIndex++;
        countTitles++;
        break;
      }
    }
    if (countTitles == 0) {
      return null;
    }
    return crdTitle;
  }
  /**
  *getAuthor method displays the books based upon
  *the search done by the author of the book.
  *@param sAuthor  this is passed to the method to search by the word.
  *@return Card[] the card aray is returned .
  */
  public Card[] getAnAuthor(final String searchAuthor) {
    Card[] crdAuthor = new Card[10];
    int newAuthorArrIndex = 0;
    int countAuthor = 0;
    for (int j  = 0; j < index; j++) {
      if (theAuthor[j].author.equalsIgnoreCase(searchAuthor)) {
        // Card[] crdAuthor=new Card[1]
        crdAuthor[newAuthorArrIndex] = theAuthor[j];
        newAuthorArrIndex++;
        countAuthor++;
        //count = c;
        //printCard(theAuthor[j]);
      }
    }
    if (countAuthor != 0) {
      return crdAuthor;

    }
    return null;
  }
    /**
    *getSubject method gives the book details based
    *upon the search done by subject of the book.
    *@param  sSubject is the string that we are passing to the method.
    *@return  Card[] the card array is returned.
    */
  public Card[] getSubject(final String searchSubject) {
    Card[] crdSubject = new Card[10];
    int newSubjectArrIndex = 0;
    int countSubjects = 0;
    for (int j = 0; j < index; j++) {
      if (theSubject[j].subject.equalsIgnoreCase(searchSubject)) {
        crdSubject[newSubjectArrIndex] = theSubject[j];
        newSubjectArrIndex++;
        countSubjects++;
      }
    }
    if (countSubjects == 0) {
      return null;
    }
    return crdSubject;
  }
  /**
  * The removeATitle method removes the book u selected .
  *@param c is the book that which we are going to delete.
  */
  public void removeATitle(final Card rmvCard) {
    for (int j = 0; j < index; j++) {
      if (rmvCard.title.compareTo(theTitle[j].title) == 0) {
        for (int k = j; k < index - 1; k++) {
          theTitle[k] = theTitle[k + 1];
        }
      }
      if (rmvCard.title.compareTo(theAuthor[j].title) == 0) {
        for (int k = j; k < index - 1; k++) {
          theAuthor[k] = theAuthor[k + 1];
        }
      }
      if (rmvCard.title.compareTo(theSubject[j].title) == 0) {
        for (int k = j; k < index - 1; k++) {
          theSubject[k] = theSubject[k + 1];
        }
      }
    }
    index--;
    System.out.println("Remaining books are:");
    for (int l = 0; l < index; l++) {
      int bookCount;
      bookCount = l;
      bookCount++;
      System.out.println(bookCount + "." + "Title:" + theSubject[l].title);
      System.out.println("Author:" + theSubject[l].author);
      System.out.println("Subject:" + theSubject[l].subject);
      System.out.println("========================================");
    }
  }
}