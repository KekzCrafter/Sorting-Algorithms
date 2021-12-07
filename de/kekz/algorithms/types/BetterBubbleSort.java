package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class BetterBubbleSort extends Algorithm {

	public BetterBubbleSort() {
		super(AlgorithmType.BETTERBUBBLE);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = new ArrayList<>();
		list.addAll(getListToSort());

		int length = list.size();

		/* Repeat as long the complete list wasn't checked */
		while (length > 0) {

			// When sorting with Bubblesort, every round the next highest number will be
			// sorted on the right of the list, which means that we can skip those in the
			// next rounds and save some time. That's the difference to the old Algorithm

			/* Compare all items */
			for (int j = 0; j < length - 1; j++) {
				double first = list.get(j), compare = list.get(j + 1);

				/* Switch places if first is higher than next item */
				if (compare <= first) {
					list.set(j, compare);
					list.set(j + 1, first);
				}
			}

			length--;
		}

		return list;
	}
}