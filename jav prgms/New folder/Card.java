  /**
  *Card is the class that contains title,subject,author
  *instance variables.
  *@param title title string
  *@param subject subject string
  *@param author author string
  */
  class Card {
      public String title;
      public String subject;
      public String author;
  /**
  *Card is the constructor here.
  *@param title title of the book.
  *@param author author of the book.
  *@param subject subject of the book.
  */
  public Card(String title , String author , String subject) {
        this.author = author;
        this.title = title;
        this.subject = subject;
      }
  }

