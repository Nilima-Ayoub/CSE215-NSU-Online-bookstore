package correctassignment;
import java.util.Arrays;
public  class BookCollection extends Book{
private  Book[] books;
private int numnerOfBooks=0;
private int nextIndex=-1;
private final int MAX_SIZE=10000;
public BookCollection(int size) {
	this.books = new Book[size];
}


public int getNumnerOfBooks() {
	return numnerOfBooks;
}
//method1
public boolean addBook(Book book) {
	if(numnerOfBooks==books.length) {
		return false;
	}
	else if(numnerOfBooks<books.length) {
		this.books[numnerOfBooks++]=book;
		return true;
	}
	else {
		return false;
	}
}

//method 3
public Book getBook(Book book) {
	int index=getBooksIndex(book);
	removeBook(book);
		return book;
		
}
//method 4
public int searchBook(String name) {
	for(int i=0;i<books.length;i++) {
		String temp=books[i].getName();
		if(temp.equals(name)) {
			return i;
		}
	}
		return 0;
}
//method 5
public Book getNext() {
	
	nextIndex++;
return books[nextIndex];
}
//method 2
public void removeBook(Book book) {
	int index=getBooksIndex(book);
	if(index>=0) {
		for(int i=index;i<numnerOfBooks-1;i++) {
			books[i]=books[i+1];
		}
		books[--numnerOfBooks]=null;
}
		else {
			System.out.println("No book found of this name");
		}
		
}
//Method for getBook
public int getBooksIndex(Book book) {
	for(int i=0;i<numnerOfBooks;i++) {
		if(books[i].equals(book)) {
			return i;
		}
		
	}
	return -1;
}
public boolean HasNext() {
	
return(nextIndex+1<books.length);

}
 
public void resetBooks() {
	nextIndex=-1;
}

@Override
public String toString() {
	return "BookCollection [books=" + Arrays.toString(books)  + "]";
}



// Sort by ISBN
public void sortByIsbn() {
	Arrays.sort(books);
}

//SORT BY PRICE.
public void sortByPrice() { 
 
    int n = books.length; 
    for (int i = 0; i < n-1; i++) 
        for (int j = 0; j < n-i-1; j++) 
            if (books[j].getPrice() > books[j+1].getPrice()) 
            { 
            	{ 
                    Book temp = books[j]; 
                    books[j]= books[j+1]; 
                    books[j+1] = temp; 
                } 
            } 
}
//SORT BY YEAR OF PUBLISH
public void sortByYearOfPublish(){
	int n=books.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(books[j].getYearOfPublish()>books[j+1].getYearOfPublish()) {
					Book temp=books[j];
					books[j]=books[j+1];
					books[j+1]=temp;
			}
		}
	}
}

}








