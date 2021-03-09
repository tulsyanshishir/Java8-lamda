package java8Lamda;

import java.util.function.BiConsumer;

public class LamdaExceptions {

	public static void main(String[] args) {

		int someArray[] = { 1, 2, 3, 4 };
		int key = 0;
		process(someArray, key, wrapper((i, k) -> System.out.println(i / k)));
	}

	private static void process(int[] someArray, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someArray) {
			consumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {
		return (i, k) -> {
			try {
				consumer.accept(i, k);
			} catch (ArithmeticException e) {
				System.out.println("Infinity");
			}
		};

	}

}
