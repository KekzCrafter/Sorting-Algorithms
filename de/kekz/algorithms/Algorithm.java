package de.kekz.algorithms;

import java.util.ArrayList;

import de.kekz.algorithms.enums.AlgorithmType;

public class Algorithm {

	private AlgorithmType algorithmType;
	private ArrayList<Double> listToSort;
	private long start, end;

	public Algorithm(AlgorithmType algorithmType) {
		this.algorithmType = algorithmType;
	}

	/* Adds the unsorted list to the algorithm */
	public Algorithm buildWithList(ArrayList<Double> list) {
		this.listToSort = list;

		return this;
	}

	/* This will return the list, but sorted */
	public ArrayList<Double> sort() {
		return null;
	}

	/* Sorts a specific list with the same algorithm above */
	public ArrayList<Double> sort(ArrayList<Double> list) {
		this.listToSort = list;
		return sort();
	}

	public AlgorithmType getAlgorithmType() {
		return algorithmType;
	}

	public ArrayList<Double> getListToSort() {
		return listToSort;
	}

	public void setStart() {
		this.start = System.nanoTime();
	}

	public void setEnd() {
		this.end = System.nanoTime();
	}

	/* Returns elapsed time in ms */
	public double getDifference() {
		long difference = this.end - this.start;
		return difference / 1000000D;
	}
}
