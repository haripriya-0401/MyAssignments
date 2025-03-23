package week1.day2;

public class Library 
{
	public char addBook(String bookTitle) 
	{
		System.out.println("Book Added Successfully: "+ bookTitle);
		return 'b';
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args)
	{
		Library o=new Library();
		System.out.println("printing from main "+ o.addBook("Harry Potter"));
		o.issueBook();
	}

}
