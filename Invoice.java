package correctassignment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map.Entry;

public class Invoice extends Book{
private int size;
private LocalDateTime date;
private Book[] book=new Book[size];
private int NumberOfBooks;
public String getDateTime() {
	 date = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
	String FormatDateTime = date.format(format);
	return FormatDateTime;
}
public Invoice(int size) {
	super();
	this.book = new Book[size];
	this.NumberOfBooks =0;
 this.size = size;
}

public void addBook(Book books) {
	
	if(NumberOfBooks<book.length) {
		this.book[NumberOfBooks++]=books;
	}
}

public double CalculateBookDiscountPrice() {
	double price=0;
	for(int i=0;i<book.length;i++) {
    price+= ((book[i].getPrice())-((book[i].getPrice())*(book[i].getPercentageDiscount()/100)));

	}
	return price;
	}

public double CalculateGenraDiscountPrice() {
	double price=0;
	for(int i=0;i<book.length;i++) {
   	price+=((book[i].getPrice())-((book[i].getPrice())*(book[i].getGenra().getGenraDiscount())));

    }
	return price;
	}

public boolean ifAuthorDiscountEligable() {
	int count=0;
	for(int i=0;i<book.length-1;i++) { 
		for(int j=i+1;j<book.length;j++) {
			if(book[i].getWriter().getName().equals(book[j].getWriter().getName())) {
				count++;
			}
			}
		}
	if(count>=3) 
	return true;
	else
	return false;
}
public double CalculateAuthorDiscountPrice() {
	 final double discount = 0.45; double price=0, finalPrice=0;
	 String[] author=new String[book.length];
	for(int i=0;i<book.length;i++) {
	  author[i]=book[i].getWriter().getName();
	}

Map<String,Integer>a= new HashMap<>(); 
	for (int i = 0; i < author.length; i++) {
		if(a.containsKey(author[i])) {
			a.put(author[i],a.get(author[i])+1);				
			}
		else {
			a.put(author[i],1);
		}
		}
	
   // Get keys and values
   for (Entry<String, Integer> entry : a.entrySet()) {
       String k = entry.getKey();
       int v = entry.getValue();
   	for(int j=0;j<book.length;j++) {
   		if(k.equals(book[j].getWriter().getName())&&v>=3) {
   			price+=((book[j].getPrice())-(book[j].getPrice()*discount));
   		}
   		if(k.equals(book[j].getWriter().getName())&&v<3) {
   			 finalPrice+= book[j].getPrice(); 
   		}
   	}
   }

return price+finalPrice;
}

public double getFinalPrice() {
if(ifAuthorDiscountEligable()==true) {	double price1=CalculateBookDiscountPrice();
	double price2=CalculateGenraDiscountPrice();
	double price3= CalculateAuthorDiscountPrice();
	double min= Math.min(Math.min(price1, price2),price3);
return min;}
else {	
	double price1=CalculateBookDiscountPrice();
    double price2=CalculateGenraDiscountPrice();
	double min= Math.min(price1, price2);
	return min;}
	}

public double calculatePrice() {    
	double sum=0.0;
  for(int i=0;i<book.length;i++) {
	sum+=book[i].getPrice();
   }
 return sum;	
}

public Book[] getBook() {
	return book;
}

public void setBook(Book[] book) {
	this.book = book;
}

public int getNumberOfBooks() {
	return NumberOfBooks;
}

public void setNumberOfBooks(int numberOfBooks) {
	NumberOfBooks = numberOfBooks;
}



public String toString() {
	String s1 ="";
	for(int i=0;i<book.length;i++) {
		s1+=i+1 +". "+book[i].getName()+": "+book[i].getPrice()+"\n";	
	} 
	return s1;
} 
}

	










