package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class InsertionSort extends Algorithm {

	public InsertionSort() {
		super(AlgorithmType.INSERTION);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = new ArrayList<Double>();
		list.addAll(getListToSort());

		int length = list.size();

		/* Repeat for every item in list */
		for (int i = 1; i < length; i++) {

			int j = i - 1;

			/* Get key element (to compare) */
			double first = list.get(i);

			/* Compare key element to the numbers (left side) */
			while (j >= 0 && list.get(j) > first) {
				list.set(j + 1, list.get(j));
				j--;
			}

			list.set(j + 1, first);
		}

		return list;
	}
}
