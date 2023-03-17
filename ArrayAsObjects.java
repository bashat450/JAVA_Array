package ArrayEx;

public class ArrayAsObjects {
	public static void main(String[] args) {
		//create array here
		NameOfProduct[] obj=new NameOfProduct[3];
		//initialize with Constructor
		obj[0]=new NameOfProduct("Washing Machine");
		obj[1]=new NameOfProduct("TV");
		obj[2]=new NameOfProduct("Mobile");
		
		//display object data
		System.out.println("Product-1");
		obj[0].display();
		System.out.println("Product-2");
		obj[1].display();
		System.out.println("Product-3");
		obj[2].display();
	}
}
class NameOfProduct{
	String product_name;
	//passing to Constructor
	NameOfProduct(String product_name){
		this.product_name=product_name;
	}
	public void display() {
		System.out.println("Name of product : "+product_name);
		System.out.println();
	}
}
