package correctassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public static void  print(BookCollection c2) {
		try {
		while(c2.HasNext()) {
			  Book book=c2.getNext();
					System.out.print(book.getName()+"\n");
					
			} 
		}
		catch(NullPointerException e) {
			
		}
		
	}
public static void find_minimim_price(BookCollection c) {
	int i=0;Book [] b=new Book[c.getNumnerOfBooks()];
	while(c.HasNext()) {
		  Book book=c.getNext();
		  b[i++]=book;
	}
	double min=b[0].getPrice();
	for( i=0;i<b.length;i++) {
		if(min>b[i].getPrice()) {
			min=b[i].getPrice();
		}
	}
	for(i=0;i<b.length;i++) {
		if(min==b[i].getPrice()) {
			System.out.println(b[i].getName()+","+min);
		}
	}
}
public static void find_maximun_Discount(BookCollection c) {
	int i=0;Book [] b=new Book[c.getNumnerOfBooks()];
	while(c.HasNext()) {
		  Book book=c.getNext();
		  b[i++]=book;
	}
	double max=b[0].getPercentageDiscount();
	for(i=0;i<b.length;i++) {
		if(max<b[i].getPercentageDiscount()) {
			max=b[i].getPercentageDiscount();
		}
	}
	for(i=0;i<b.length;i++) {
		if(max==b[i].getPercentageDiscount()) {
			System.out.println(b[i].getName()+","+max);
		}
	}
}
	public static void PrintAgeBetween50To55(BookCollection c) {
	  int i=0;Book [] books=new Book[c.getNumnerOfBooks()];
	while(c.HasNext()) {
		  Book book=c.getNext();
		  books[i++]=book;
	}
	    final int intial_age=50;
		final int final_age=55;
		Author[] author=new Author[books.length];
		for(i=0;i<books.length;i++) {
			author[i]=books[i].getWriter();
			}
		Map <Author,Integer> b=new HashMap<>();
		for(i=0;i<author.length;i++) {
		if(b.containsKey(author[i])) {
			b.put(author[i], b.get(author[i])+1);
		}
		else {
			b.put(author[i],1);
		}
		}
		for(Entry<Author,Integer> entry:b.entrySet()) {
		       Author k = entry.getKey();
	        if(k.getAge()>intial_age&&k.getAge()<final_age) {
	        	System.out.print(k.getName()+","+k.getAge()+"\n");
	        }
		}
	}
	
		
	public static void main(String[] args) {
		Author a1 = new Author("John Green", "green@example.com", 42, "male");
		Author a2 = new Author("JK Rowling", "rowling@exmaple.com", 54, "female");
		Author a3 = new Author("Nicholas Sparks", "sparks@exmaple.com", 53, "male");
		Author a4 = new Author("Rick Riordan", "riordan@exmaple.com", 55, "male");
		Author a5 = new Author("Stephen Hawking", "", -1, "male");
		Author a6 = new Author("Dan Brown", "brown@exmaple.com", 55, "male");
		Author a7 = new Author("Stephen King", "king@exmaple.com", 72, "male");
		Author a8 = new Author("Malcolm Gladwell", "gladwell@exmaple.com", 56, "male");
		Author a9 = new Author("Kyo Maclear", "maclear@exmaple.com", 49, "female");


		Book b0 = new Book("The Burning Maze", 250, a4, 10.6, new Fiction("fantasy"), "9123567891208", 2018);
		Book b1 = new Book("The Philosopher's Stone", 550, a2, 10.3, new Fiction("fantasy"), "9123567891201", 1997);
		Book b2 = new Book("The Chamber of Secrets", 450, a2, 10.2, new Fiction("fantasy"), "9123567891202", 1998);
		Book b3 = new Book("The Prisoner of Azkaban", 330, a2, 8.5, new Fiction("fantasy"), "9123567891203", 1999);
		Book b4 = new Book("The Goblet of Fire", 300, a2, 7.3, new Fiction("fantasy"), "9123567891205", 2000);
		Book b5 = new Book("Looking for Alaska", 500, a1, 10.8, new Fiction("Young adult fiction"), "9123567891206", 2005);
		Book b6 = new Book("Paper Towns", 250, a1, 8, new Fiction("mystry"), "9123567891207", 2008);
		Book b7 = new Book("A Walk to Remember", 350, a3, 9.5, new Fiction("drama"), "9123567891208", 2002);
		Book b8 = new Book("The Lightning Thief", 450, a4, 8.4, new Fiction("fantasy"), "9123567891208", 2005);
		Book b9 = new Book("The House of Hades", 150, a4, 10.5, new Fiction("fantasy"), "9123567891209", 2013);
		Book b10 = new Book("Inferno", 450, a6, 10.6, new Fiction("thriller"), "9123567891209", 2013);
		Book b11 = new Book("Deception point", 550, a6, 10.6, new Fiction("mystry"), "9123567891210", 2001);
		Book b12 = new Book("angels and demons", 430, a6, 10.5, new Fiction("crime"), "9123567891211", 2000);
		Book b13 = new Book("Da Vinci Code", 470, a6, 11.5, new Fiction("crime"), "9123567891212", 2000);
		Book b14 = new Book("Origin", 370, a6, 11.5, new Fiction("crime"), "9123567891212", 2017);
		Book b15 = new Book("A Brief History of Time", 330, a5, 5.5, new Non_Fiction("science"), "9123567891213", 1998);
		Book b16 = new Book("The Theory of Everything", 420, a5, 6.3, new Non_Fiction("science"), "9123567891214", 2004);
		Book b17 = new Book("God Created the Integers", 423, a5, 7.2, new Non_Fiction("biography"), "9123567891215", 2005);
		Book b18 = new Book("The Green Mile", 270, a7, 11.5, new Fiction("fantasy"), "9123567891216", 1996);
		Book b19 = new Book("Blink", 423, a8, 7.2, new Non_Fiction("self-help"), "9123567891217", 2005);
		Book b20 = new Book("Birds Art Life", 403, a9, 3.0, new Non_Fiction("biography"), "9123567891218", 2017);
		//input set for task 1, 2 ***
		
	 BookCollection  c1 = new BookCollection(6);
		c1.addBook(b0); c1.addBook(b5); c1.addBook(b1); c1.addBook(b3); c1.addBook(b4); c1.addBook(b2);
		
		
		// input set for task 3,4,5,6 ***
		BookCollection c = new BookCollection(21);
		c.addBook(b0); c.addBook(b15); c.addBook(b1); c.addBook(b3); c.addBook(b4); c.addBook(b2); 
		c.addBook(b6); c.addBook(b18); c.addBook(b17); c.addBook(b11); c.addBook(b10); c.addBook(b19);
		c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b5); c.addBook(b16); c.addBook(b7);
		c.addBook(b8); c.addBook(b9); c.addBook(b20);
		
		
		Book book;
		System.out.println("Task 1");

		while(c1.HasNext()) {
			c1.sortByIsbn();
		 book=c1.getNext();
				System.out.print(book.getName()+","+book.getIsbn()+"\n");
		}
		c1.resetBooks();
		System.out.println("\n");
		System.out.println("Task 2");
		while(c1.HasNext()) {
			c1.sortByYearOfPublish();
		  book=c1.getNext();
				System.out.print(book.getName()+","+book.getWriter().getName()+","+book.getYearOfPublish()+"\n");
		} 
		
		
		//TASK 3
	      System.out.println();
	     System.out.println("Task 3");
		PrintAgeBetween50To55(c);
		
		//TASK 4
	           System.out.println();
		        c.resetBooks();
				System.out.println("Task 4");
				find_minimim_price(c);
				System.out.println();
				
				//TASK 5
				c.resetBooks();
				System.out.println("\nTask 5");
				find_maximun_Discount(c);
				System.out.println();
		
		
		//TASK 6
		      System.out.println();
             c.resetBooks();
				System.out.println("\nTask 6");
				while(c.HasNext()) {
				  book=c.getNext();
				  if(("crime"==book.getGenra().getSubGenra())&&(book.getYearOfPublish()>2010) ){
						System.out.print(book.getName()+","+book.getWriter().getName());
					}
				} 
					
		Invoice i = new Invoice(4);
		i.addBook(b1);
		i.addBook(b2);
		i.addBook(b3);
		i.addBook(b8);
		
		//TASK 7
	      System.out.println();
		System.out.println("\nTask 7");
		System.out.print("Purchase Date:"+i.getDateTime()+"\n");
		System.out.print(i);
		System.out.print("\n"+"Price:"+i.calculatePrice()+"\n"+"Price after discount:"+i.getFinalPrice());

		System.out.println();
		
		BookCollection c2 = new BookCollection(6);
		c2.addBook(b0);c2.addBook(b1); c2.addBook(b3); c2.addBook(b4); c2.addBook(b2);c2.addBook(b15);
		c2.resetBooks();

	  //Task 8
		Invoice i1 = new Invoice(2);
		i1.addBook(b1);
		i1.addBook(b0);
		System.out.println("\nTask 8");
		System.out.print("Purchase Date:"+i1.getDateTime()+"\n");
		System.out.print(i1);
		System.out.print("\n"+"Price:"+i1.calculatePrice()+"\n"+"Price after discount:"+i1.getFinalPrice());
		System.out.println();
		c2.removeBook(b0);
		c2.removeBook(b1);
		System.out.println();
		print(c2);
		
		
		
	}
}
	


