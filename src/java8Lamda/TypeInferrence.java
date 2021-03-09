package java8Lamda;

public class TypeInferrence {

	public static void main(String[] args) {
		StringLengthLamda myLamda = s->s.length();
		System.out.println(myLamda.getLength("Hello Universe"));
		
		printLambda(s->s.length());

	}
	
	public static void printLambda(StringLengthLamda l) {
		System.out.println(l.getLength("Hello Universe2"));
	}
	interface StringLengthLamda{
		int getLength(String s);
	}
}
