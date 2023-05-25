package application;

public class App {
	public static void main(String[] args) {
		HelloClass.sayHello("Mateo");
	}
}

class HelloClass {
	private HelloClass() {}
	
	public static void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
}