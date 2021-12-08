package de.kekz.algorithms.types;

import java.util.ArrayList;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class QuickSort extends Algorithm {

	public QuickSort() {
		super(AlgorithmType.QUICK);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = getListToSort();

		/* Only sort if list is not empty */
		if (!list.isEmpty()) {

			/* Get pivot element */
			double pivot = list.get(0);

			/* Remove pivot from list */
			list.remove(pivot);

			/* Create two temporary lists */
			ArrayList<Double> lower = new ArrayList<>(), higher = new ArrayList<>();

			/* Check wether x is lower or higher than pivot */
			for (double x : list) {
				if (x < pivot) {
					lower.add(x);
				} else {
					higher.add(x);
				}

				addComparison();
			}

			/* Sort lower & higher */
			lower = sort(lower);
			higher = sort(higher);

			/* Add all together */
			lower.add(pivot);
			lower.addAll(higher);

			return lower;
		}

		return list;
	}
}
