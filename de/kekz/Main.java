package de.kekz;

import java.security.SecureRandom;
import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.types.BetterBubbleSort;
import de.kekz.algorithms.types.BubbleSort;
import de.kekz.algorithms.types.Default;
import de.kekz.algorithms.types.InsertionSort;
import de.kekz.algorithms.types.QuickSort;
import de.kekz.algorithms.types.SelectionSort;

public class Main {

	public static void main(String... strings) {
		ArrayList<Algorithm> algos = new ArrayList<Algorithm>();
		ArrayList<Double> list = new ArrayList<Double>();

		SecureRandom random = new SecureRandom();
		int amount = 1337;
		for (int i = 0; i < amount; i++) {
			list.add(random.nextDouble());
		}

		System.out.println("Item amount: " + amount);
		System.out.println("");

		// Somehow, first algorithm is always a bit slower than the following ones?
		// Because the program need to start first?
		algos.add(new Default()); // just skip this in console
		algos.add(new Default());
		algos.add(new SelectionSort());
		algos.add(new BubbleSort());
		algos.add(new BetterBubbleSort());
		algos.add(new InsertionSort());
		algos.add(new QuickSort());

		for (Algorithm algorithm : algos) {
			algorithm.buildWithList(list);

			algorithm.setStart();
			algorithm.sort();
			algorithm.setEnd();

			System.out.println("algorithm: \"" + algorithm.getAlgorithmType().name().toLowerCase() + "\", comparisons: "
					+ algorithm.getComparisons() + ", time: " + algorithm.getDifference() + "ms");
		}

		list.clear();
		algos.clear();
	}
}
