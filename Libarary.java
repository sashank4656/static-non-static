public class Library{
	public static String libraryName="Central Library";
	public String bookTitle;
public static void main(String args[])
{
	System.out.println("Library Name :"+Library.libraryName);
	System.out.println("Book Title :"+bookTitle);
	//Error we cannot access non static variables directly without object reference
}
}
