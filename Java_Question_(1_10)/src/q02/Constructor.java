package q02;

//child class constructor calling parent class constructor
//constructor chaining b/w diff classes using super() keyword
//constructor chaining within class using this() keyword

public class Constructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Parent po = new Parent(5,6);
		System.out.println("--------------------------------");
		Parent po1 = new Child(5,6);
		System.out.println("--------------------------------");
		Child ch1=new Child(9);
		
		
		
	}

}
//superClass
 class Parent {

	Parent()
	{
		
		System.out.println("NON-PARAMETRIZED PARENT CLASS CONSTRUCTOR");
	}
	Parent(int x)
	{
		this();//constructor chaining
		System.out.println("1-PARAMETER PARENT CLASS CONSTRUCTOR");
	}
	Parent(int x,int y){
		this(x);//constructor chaining
		System.out.println("2-PARAMETER PARENT CLASS CONSTRUCTOR");
	}
	 

}
 //subclass
 class Child extends Parent {
     
	int x;
	int y;
	 

	 
	Child()
	{
		 
		 System.out.println("NON-PARAMETRIZED  CHILD CONSTRUCTOR");
	}
	 
	 Child(int x)
		{    
		     this();//constructor chaining
			 System.out.println("1-PARAMETER CHILD CONSTRUCTOR");
		}
	 Child(int x,int y)
	 {
		 super(x,y);//calling parent class 2 parameter costructo
		// this(x);//constructor chaining
		//super() and this() 
 		 this.x = x; //setting values at time of object creation
		 this.y = y;
		 System.out.println(x+" :: "+y);
		 System.out.println("2-PARAMETER CHILD CONSTRUCTOR");
	 }
	 
}