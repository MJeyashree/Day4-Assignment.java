/*                                               Day-4 Assignment Questions
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
‌
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
‌
3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated. 
7.Design a calculator application using Java Inheritance. Create the following class hierarchy:
--->BasicCalculator (Base class):
Implement all the basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
--->AdvancedCalculator (Inherits from BasicCalculator)
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
--->ScientificCalculator (Inherits from AdvancedCalculator)
Add scientific functions, such as:
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three
levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/

/*1.We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. 
Create its two subclasses---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or 
petrol).---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or 
spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, 
mileage and price.) Do the same for a Bajaj and a TVS bike. */
import java.util.ArrayList;
class Vehicle{
	double mileage;
	double price;
	public Vehicle(double mileage,double price){
		this.mileage=mileage;
		this.price=price;
	}
}
class Car extends Vehicle{
	double ownerShipCost;
	int warranty;
	int seatingCapacity;
	String fuelType;
	public Car(double mileage,double price,double ownerShipCost,int warranty,int seatingCapacity,String fuelType){
		super(mileage,price);
		this.price=price;
		this.ownerShipCost=ownerShipCost;
		this.warranty=warranty;
	    this.seatingCapacity=seatingCapacity;
		this.fuelType=fuelType;
	}
}
class Bike extends Vehicle{
	int cylinder;
	int gear;
	String coolingType;
	String wheelType;
	int fuelTankSize;
	public Bike(double mileage,double price,int cylinder,int gear,String coolingType,String wheelType,int fuelTankSize){
		super(mileage,price);
		this.cylinder=cylinder;
		this.gear=gear;
		this.coolingType=coolingType;
		this.wheelType=wheelType;
		this.fuelTankSize=fuelTankSize;
	}
}
class Audi extends Car{
	String modelType;
	public Audi(String modelType,double mileage,double price,double ownerShipCost,int warranty,int seatingCapacity,String fuelType){
		super(mileage,price,ownerShipCost,warranty,seatingCapacity,fuelType);
		this.modelType=modelType;
	}
	void display(){
		System.out.println("	Model Type : " + modelType);
		System.out.println("	OwnerShipCost : " + ownerShipCost);
		System.out.println("	Number of Years of Warranty : " + warranty);
		System.out.println("	Seating capacity : " + seatingCapacity);
		System.out.println("	Fuel Type : " + fuelType);
		System.out.println("	Mileage : " + mileage);
		System.out.println("	Price : " + price);
		System.out.println("=======================");
	}
}
class Ford extends Car{
	String modelType;
	public Ford(String modelType,double mileage,double price,double ownerShipCost,int warranty,int seatingCapacity,String fuelType){
		super(mileage,price,ownerShipCost,warranty,seatingCapacity,fuelType);
		this.modelType=modelType;
	}
	void display(){
		System.out.println("	Model Type : " + modelType);
		System.out.println("	OwnerShipCost : " + ownerShipCost);
		System.out.println("	Number of Years of Warranty : " + warranty);
		System.out.println("	Seating capacity : " + seatingCapacity);
		System.out.println("	Fuel Type : " + fuelType);
		System.out.println("	Mileage : " + mileage);
		System.out.println("	Price : " + price);
		System.out.println("=======================");
	}
}
class Bajaj extends Bike{
	String makeType;
	public Bajaj(String makeType,double mileage,double price,int cylinder,int gear,String coolingType,String wheelType,int fuelTankSize){
		super(mileage,price,cylinder,gear,coolingType,wheelType,fuelTankSize);
		this.makeType = makeType;
	}
	void display(){
		System.out.println("	Bajaj Make Type : " + makeType);
		System.out.println("	Cylinders : " + cylinder);
		System.out.println("	Gears : " + gear);
		System.out.println("	Cooling Type : " + coolingType);
		System.out.println("	Wheel Type : " + wheelType);
		System.out.println("	Fuel Tank Size : " + fuelTankSize);
		System.out.println("	Mileage: " + mileage);
		System.out.println("	Price : " + price);
		System.out.println("===========================");
		
	}
}
class TVS extends Bike{
	String makeType;
	public TVS(String makeType,double mileage,double price,int cylinder,int gear,String coolingType,String wheelType,int fuelTankSize){
		super(mileage,price,cylinder,gear,coolingType,wheelType,fuelTankSize);
		this.makeType = makeType;
	}
    void display(){
		System.out.println("	TVS Make Type : " + makeType);
		System.out.println("	Cylinders : " + cylinder);
		System.out.println("	Gears : " + gear);
		System.out.println("	Cooling Type : " + coolingType);
		System.out.println("	Wheel Type : " + wheelType);
		System.out.println("	Fuel Tank Size : " + fuelTankSize);
		System.out.println("	Mileage: " + mileage);
		System.out.println("	Price : " + price);
		System.out.println("==================================");
	}
}

class VehicleInfo{
	public static void main(String[] args){
		System.out.println("		AUDI Car Info");
		Audi audi = new Audi("A1",20.0,8000000,70000,5,6,"Petrol");
		audi.display();
		System.out.println("		Ford Car Info");
		Ford ford = new Ford("Bronco",16.0,110000,25000,5,4,"Diesel");
		ford.display();
		System.out.println("		Bajaj Bike Info");
		Bajaj bajaj = new Bajaj("Bajaj V15",55.0,98000,5,1,"Air","Alloys",12);
		bajaj.display();
		System.out.println("		TVS Bike Info");
		TVS tvs = new TVS("Pulzar",60.3,150000,6,8,"oil","Folks",13);
		tvs.display();
	}
}
       /*  AUDI Car Info
        Model Type : A1
        OwnerShipCost : 70000.0
        Number of Years of Warranty : 5
        Seating capacity : 6
        Fuel Type : Petrol
        Mileage : 20.0
        Price : 8000000.0
=======================
                Ford Car Info
        Model Type : Bronco
        OwnerShipCost : 25000.0
        Number of Years of Warranty : 5
        Seating capacity : 4
        Fuel Type : Diesel
        Mileage : 16.0
        Price : 110000.0
=======================
                Bajaj Bike Info
        Bajaj Make Type : Bajaj V15
        Cylinders : 5
        Gears : 1
        Cooling Type : Air
        Wheel Type : Alloys
        Fuel Tank Size : 12
        Mileage: 55.0
        Price : 98000.0
===========================
                TVS Bike Info
        TVS Make Type : Pulzar
        Cylinders : 6
        Gears : 8
        Cooling Type : oil
        Wheel Type : Folks
        Fuel Tank Size : 13
        Mileage: 60.3
        Price : 150000.0
==================================
 */
 

/* 2.Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is 
derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments" */	
	
class TwoD{
	public int x,y;
	public TwoD(){
		System.out.println("TwoD default Constructor");
		this.x=0;
		this.y=0;
	}
	public TwoD(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("TwoD Constructor with two Arguments");
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public void twoDisplay(){
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
}
class ThreeD extends TwoD{
	private int z;
	public ThreeD(){
		super();
		this.z=0;
	}
	public ThreeD(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	public void setZ(int z){
		this.z=z;
	}
	public int getZ(){
		return z;
	}
	public void threeDisplay(){
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("Z : " + z);
    }
	public void calcDistance(ThreeD X1,ThreeD X2){
		double distance = Math.sqrt(Math.pow(X2.x - X1.x,2) + Math.pow(X2.y - X1.y,2) + Math.pow(X2.z - X1.z,2));
		System.out.println("Find the Distance of ThreeD Point : " + distance);
	}
}
class ThreeTwoMain{
	public static void main(String[] args){
		TwoD two = new TwoD();
		two.twoDisplay();
		ThreeD three = new ThreeD();
		three.threeDisplay();
		ThreeD three1 = new ThreeD(4,6,8);
		three1.threeDisplay();
		ThreeD three2=new ThreeD(); 
		three2.setX(3); 
		three2.setY(6);
		three2.setZ(9);
		three1.calcDistance(three1,three2);
	}
}


          /* OUTPUT

/* 3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14 */

class Point{
	private int x=0;
	private int y=0;
	public Point(){
		x=0;
		y=0;
	}
	public void setPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void printPoint(){
		System.out.println("The (x,y) is : " + "(" + x + "," + y + ")");
	}
}
class Circle extends Point{
	private double radius;
	public Circle(){
		radius=1;
	}
	public void setRadius(double r){
		if(r > 0){
			radius = r;
		}else{
			radius = 1;
		}
	}
	public double getRadius(){
		return radius;
	}
	public double area(){
		return 3.14 * radius * radius;
	}
	public void pointCircleDisplay(){
		System.out.println("Circle Center is : ");
		printPoint();
		System.out.println("Radius is : " + radius);
		System.out.println("Area is : " + area());
	}
}
class CircleMain{
	public static void main(String[] args){
		Circle cr = new Circle();
		int x=2;
		System.out.println("Enter X : " + x);
		int y=2;
		System.out.println("Enter y : " + y);
		double r=1;
		System.out.println("Enter Radius : " + r);
		cr.setPoint(x,y);
		cr.setRadius(r);
		cr.pointCircleDisplay();
	}
}

/*        OUTPUT
   Enter X : 2
   Enter y : 2
   Enter Radius : 1.0
   Circle Center is :
   The (x,y) is : (2,2)
   Radius is : 1.0
   Area is : 3.14  */

 /* 4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.*/
 
 class Fruit{
	void display(){
		System.out.println("The Parent Class Fruit");
	}
	class Car{
		void display(){
			System.out.println("Car is a not a type of Fruit");
		}
	}
	/*class Cycle extends Car,Fruit{ //  error: '{' expected class Cycle extends Car,Fruit{
		void display(){
			System.out.println("Cycle is not a type of Fruit and Car");
		}
	}*/
 }
 class MultiMain{
	public static void main(String[] args){
		System.out.println("Java doesn't Support (These type of Relationship) Multiple Inheritance using Classes.");
	}
 }
                               /* OUTPUT  
		 Java doesn't Support (These type of Relationship) Multiple Inheritance using Classes. */
		
 
 /* 5.Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class 
with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which
prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which 
prints "Square is a rectangle".Now, try calling the method by the object of each of these classes. */
		
class Shape{
	void display(){
		System.out.println("This is a Shape");
	}
}
class Polygon extends Shape{
	@Override
	void display(){
		System.out.println("Polygon is a Shape");
	}
}
class Rectangle extends Polygon{
	@Override
	void display(){
		System.out.println("Rectangle is a Polygon");
	}
}
class Triangle extends Polygon{
	@Override
	void display(){
		System.out.println("Triangle is a Polygan");
	}
}

class Square extends Rectangle{
	@Override
	void display(){
		System.out.println("Square is a Rectangle");
	}
}
class MainShape{
	public static void main(String[] args){
		Shape shape=new Shape();
		shape.display();
		Polygon poly=new Polygon();
		poly.display();
		Rectangle rect=new Rectangle();
		rect.display();
		Triangle tri=new Triangle();
		tri.display();
		Square square=new Square();
		square.display();
	}
}

/*               OUTPUT
           This is a Shape
           Polygon is a Shape
           Rectangle is a Polygon
           Triangle is a Polygan
           Square is a Rectangle      */
		   
/* 6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object 
containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated. */

//import java.util.ArrayList;
class Store{
	static String storeName;
	static String storeLocation;
	private ArrayList<Product>products;
	public Store(){
		products=new ArrayList<>();
	}
	public static void setStoreDetails(String name,String location){
		storeName=name;
		storeLocation=location;
	}
	public static void displayStoreDetails(){
		System.out.println("Store Name : " + storeName);
		System.out.println("Store Location : " + storeLocation);
	}
	public void addProduct(Product product){
		products.add(product);
    }
    public void displayAllproducts(){
		System.out.println("List of Products : ");
		for(Product p : products){
			p.displayProduct();
		}
	}
}
class Product{
	private int productID;
	private String name;
	private double price;
	private int quantity;
	public Product(int productID,String name,double price,int quantity){
		this.productID=productID;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public void displayProduct(){
		System.out.println("Product ID : " + productID);
		System.out.println("Product Name : " + name);
		System.out.println("Product's price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("================================");
	}
}
class MainStore{
	public static void main(String[] args){
		Store.setStoreDetails("Big Bazzar","Chennai");
		Store bigStore=new Store();
		Product p1 = new Product(201,"Chocolates",150.48,20);
		Product p2 = new Product(201,"Cookies",120.05,32);
        Product p3 = new Product(201,"Fruits",500,10);
        Product p4 = new Product(201,"Vegetables",230,15);
        Product p5 = new Product(201,"Nuts",1000,30);
		bigStore.addProduct(p1);
		bigStore.addProduct(p2);
		bigStore.addProduct(p3);
		bigStore.addProduct(p4);
		bigStore.addProduct(p5);
		Store.displayStoreDetails();
		bigStore.displayAllproducts();
	}
}

/* 7.Design a calculator application using Java Inheritance. Create the following class hierarchy:
--->BasicCalculator (Base class):
Implement all the basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
--->AdvancedCalculator (Inherits from BasicCalculator)
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
--->ScientificCalculator (Inherits from AdvancedCalculator)
Add scientific functions, such as:
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three
levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations. */

class BasiCalculator{
	public int add(int a,int b){
		return a+b;
    }
	public int subtract(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public double divide(int a,int b){
		return a/b;
	}
}
class AdvancedCalculator extends BasiCalculator{
	public double power(int base,int exponent){
		return Math.pow(base,exponent);
	}
	public double modulus(int a,int b){
		return a%b;
	}
	public double squareRoot(double number){
		return Math.sqrt(number);
	}
}
class ScientificCalculator extends AdvancedCalculator{
	public double sin(double angle){
		return Math.sin(Math.toRadians(angle));
	}
	public double cos(double angle){
		return Math.cos(Math.toRadians(angle));
	}
	public double log(double value){
		return Math.log(value);
	}
	public double exp(double value){
		return Math.exp(value);
	}
}
class CalcMain{
	public static void main(String[] args){
		ScientificCalculator calc=new ScientificCalculator();
		System.out.println("	Basic Calculator");
		System.out.println("Addition : " + calc.add(30,20));
		System.out.println("Addition : " + calc.subtract(30,20));
		System.out.println("Addition : " + calc.multiply(30,20));
		System.out.println("Addition : " + calc.divide(30,20));
		System.out.println("	Advanced Calculator");
		System.out.println("Power " + calc.power(5,2));
		System.out.println("Module " + calc.modulus(5,2));
		System.out.println("Square Root " + calc.squareRoot(25));
        System.out.println("	Scientific Calculator");
		System.out.println("Sin(10) : " + calc.sin(10));
		System.out.println("Cos(10) : " + calc.cos(10));
		System.out.println("Log(10) : " + calc.log(10));
		System.out.println("Exp(10) : " + calc.exp(10));
    }
}
        /*   OUTPUT
	 Basic Calculator
Addition : 50
Addition : 10
Addition : 600
Addition : 1.0
        Advanced Calculator
Power 25.0
Module 1.0
Square Root 5.0
        Scientific Calculator
Sin(10) : 0.17364817766693033
Cos(10) : 0.984807753012208
Log(10) : 2.302585092994046
Exp(10) : 22026.465794806718    */





