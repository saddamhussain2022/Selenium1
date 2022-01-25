package JAVA_Concepts;

public class Child extends  Parent{

	public static void main(String[] args) {
		 System.out.println("i a m in child class");
		
		Child ch = new Child();
		ch.home();
		ch.car();
		ch.bike();
		ch.flat();
	   
	}
	public void bike() {
		System.out.println("bike");
	}
	public void flat() {
		System.out.println("flat");
	}

}
