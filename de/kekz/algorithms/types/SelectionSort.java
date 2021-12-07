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
		ArrayList<Double> list = new ArrayList<>();
		list.addAll(getListToSort());

		int i = 0, length = list.size();

		/* Repeat as long the complete list wasn't checked */
		while (i < length) {

			int minIndex = i, j = i;

			/* Find index of lowest number */
			while (j < length) {
				double first = list.get(minIndex), compare = list.get(j);

				if (compare < first) {
					minIndex = j;
				}

				j++;
			}

			/* Switch lowest with compared number */
			double temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);

			i++;
		}

		return list;
	}
}
