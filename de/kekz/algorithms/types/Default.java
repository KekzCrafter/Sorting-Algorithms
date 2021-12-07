package de.kekz.algorithms.types;

import java.util.ArrayList;
import java.util.Collections;

import de.kekz.algorithms.Algorithm;
import de.kekz.algorithms.enums.AlgorithmType;

public class Default extends Algorithm {

	public Default() {
		super(AlgorithmType.DEFAULT);
	}

	@Override
	public ArrayList<Double> sort() {

		/* Copy cached list */
		ArrayList<Double> list = new ArrayList<>();
		list.addAll(getListToSort());

		/* Sort */
		Collections.sort(list);

		return list;
	}
}
