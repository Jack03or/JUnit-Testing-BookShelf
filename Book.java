package tests;

public class Book {
   private String title;
   private String author;
   private int year;
   
   public Book (String t, String a, int y) {
	   this.title = t;
	   this.author = a;
	   this.year = y;
   }
   
   public String getTitle()
   {
	   return this.title;
   }
   
   public String getAuthor()
   {
	   return this.author;
   }
   
   public int getYear()
   {
	   return this.year;
   }
   
   
   /** Overriding the Object superclass toString method */
   public String toString()
   {
	   return "\nTitle : " + this.title + 
			   "\nAuthor : " + this.author + 
			   "\nYear : " + this.year;
   }
   
   /** Overriding the Object superclass equals method */
   public boolean equals(Object o)
   {
	   Book b = (Book)o;
	   if (this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor())
			   && this.year == b.getYear())
			return true;
	   else
		   return false;
   }
   
}
