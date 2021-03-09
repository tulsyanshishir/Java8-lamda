package java8Lamda;

public class Greeter {
	public void Greet(Greeting greeting) {
		greeting.perform();
		//System.out.println("Hello World");
	}
	public static void main(String[] args) {
		Greeter greet = new Greeter();
		HelloWorldGreetin hwg = new HelloWorldGreetin();
		greet.Greet(hwg);
		GoodMorningGreeting gmg = new GoodMorningGreeting();
		greet.Greet(gmg);

		
		Greeting myLambda = ()->System.out.println("Lamda World");
		//AddIt addFun = (int a , int b)->a+b;
		greet.Greet(myLambda);
		//myLambda.perform();
	}

}
	
//interface MyLamda{
//	void foo();
//}
//interface AddIt{
//	int add(int a, int b);
//}

