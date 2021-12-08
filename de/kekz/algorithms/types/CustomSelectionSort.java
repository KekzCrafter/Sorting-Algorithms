package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class CustomSelectionSort extends Algorithm {

	public CustomSelectionSort() {
		super(AlgorithmType.CUSTOMSELECTION);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = new ArrayList<>();
		list.addAll(getListToSort());

		int length = list.size();

		/* Repeat as long the complete list wasn't checked */
		while (length > 0) {

			/* Get first element */
			double first = list.get(0);

			/* Is there any x lower than first? */
			for (double x : list.subList(0, length)) {
				if (x < first) {
					first = x;
				}

				addComparison();
			}

			/* Remove found number from list */
			list.remove(first); // not working good, only removes the first found element, thas why I added
								// decimals to randomize items

			/* Sort found number to the end */
			list.add(first);

			length--;
		}

		return list;
	}
}