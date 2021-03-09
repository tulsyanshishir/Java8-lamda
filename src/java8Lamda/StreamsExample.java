package java8Lamda;

import java.util.Arrays;
import java.util.List;
public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("a", "b", 1),
				new Person("c", "d", 2),
				new Person("e", "f", 3),
				new Person("g", "h", 4)
				);

		
		people.stream()
		.filter(p->p.getFirstName().startsWith("c"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		long count  = (long) people.parallelStream()
		.filter(p->p.getFirstName().startsWith("c"))
		.count();

		
		System.out.println(count);
	}

}
