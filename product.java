public class Product{
	public static String category="Electronics";
	public static String productName;
public static void main(String args[])
{
	Product p1 = new Product();
	Product p2 = new Product();
	p1.productName = "Laptop";
	System.out.println("Category: "+Product.category);
	System.out.println("Product 1 :"+p1.productName);
	p2.productName = "Mobile";
	System.out.println("Product 2 :"+p2.productName);

}
}
