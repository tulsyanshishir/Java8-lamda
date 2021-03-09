package java8Lamda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionjava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("a", "h", 1), new Person("c", "d", 2), new Person("e", "d", 3),
				new Person("g", "b", 4));

		// Step 1 Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step 2 Create a method that prints all the elements in the list
		printAll(people);

		// Step 3 Create a method that prints all people that have name beginining with
		// C
		//printLastNameBeginingWithC(people);

		printConditionally(people, new Condition() {		
			@Override
			public boolean test(Person p) {				
				return p.getLastName().startsWith("c");
			}
		});
		
		printConditionally(people, new Condition() {		
			@Override
			public boolean test(Person p) {				
				return p.getFirstName().startsWith("c");
			}
		});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printLastNameBeginingWithC(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	public boolean test(Person p);
}
