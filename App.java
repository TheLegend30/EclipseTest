package application;

public class App {
	public static void main(String[] args) {
		new HelloClass("Pedro").sayHello();
	}
}

class HelloClass {
	private String name;
	
	public HelloClass(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello, " + name);
	}
}