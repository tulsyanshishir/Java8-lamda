package java8Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("a", "b", 1),
				new Person("c", "d", 2),
				new Person("e", "f", 3),
				new Person("g", "h", 4)
				);
		
		// Step 1 Sort list by last name
				Collections.sort(people, (Person o1,Person o2)-> o1.getLastName().compareTo(o2.getLastName()));

				// Step 2 Create a method that prints all the elements in the list
				printConditionally(people,p->true,System.out::println);

				// Step 3 Create a method that prints all people that have name beginining with
				// C
				//printLastNameBeginingWithC(people);

				printConditionally(people, p->p.getLastName().startsWith("c"),System.out::println);
				
				printConditionally(people, p->p.getFirstName().startsWith("c"),System.out::println);

			}

			private static void printConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consume) {
				for (Person p : people) {
					if (predicate.test(p)) {
						consume.accept(p);
					}
				}

			}


		}
