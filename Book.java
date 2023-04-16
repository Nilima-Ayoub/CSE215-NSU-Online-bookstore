package correctassignment;
public class Book implements Comparable <Book>{
private String name;
private double price;
private Author writer;
public Genra genra;
private double percentageDiscount;
private String isbn;
private int yearOfPublish;
public Book(String name, double price, Author writer,  double percentageDiscount,Genra genra, String isbn,
		int yearOfPublish) {
	this.name = name;
	this.price = price;
	this.writer = writer;
	this.percentageDiscount = percentageDiscount;
	this.genra = genra;
	this.isbn = isbn;
	this.yearOfPublish = yearOfPublish;
}

public Book() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Author getWriter() {
	return writer;
}
public void setWriter(Author writer) {
	this.writer = writer;
}
public Genra getGenra() {
	return genra;
}
public void setGenra(Genra genra) {
	this.genra = genra;
}
public double getPercentageDiscount() {
	return percentageDiscount;
}
public void setPercentageDiscount(double percentageDiscount) {
	this.percentageDiscount = percentageDiscount;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn=isbn;
}
public int getYearOfPublish() {
	return yearOfPublish;
}
public void setYearOfPublish(int yearOfPublish) {
	this.yearOfPublish = yearOfPublish;
}


public  int compareTo(Book b) {
	if(isbn.compareTo(b.getIsbn())<0) {
		return -1;
	}
	else if(isbn.compareTo(b.getIsbn())>0){
		return 1;
	}
	else {
		return 0;
	}
	
	
}
@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + ", writer=" + writer + ", genra=" + genra
			+ ", percentageDiscount=" + percentageDiscount + ", isbn=" + isbn + ", yearOfPublish=" + yearOfPublish
			+ "]";
}

}



