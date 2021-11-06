package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class SelectionSort extends Algorithm {

	public SelectionSort() {
		super(AlgorithmType.SELECTION);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = getListToSort();

		int i = 0, length = list.size();

		/* Repeat as long the complete list wasn't checked */
		while (i < length) {

			/* Get element */
			double first = list.get(i);

			/* Is there any x lower than first? */
			for (double x : list.subList(i, length)) {
				if (x < first) {
					first = x;
				}

				addComparison();
			}

			/* Remove found number from list */
			list.remove(first); // not working good, only removes the first found element, thas why I added
								// decimals to randomize items

			/* Sort found number */
			list.add(i, first);

			i++;
		}

		return list;
	}
}
