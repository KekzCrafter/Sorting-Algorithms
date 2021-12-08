package de.kekz.algorithms;

import java.util.ArrayList;

import de.kekz.algorithms.enums.AlgorithmType;

public class Algorithm {

	private ArrayList<Double> listToSort;
	private AlgorithmType algorithmType;

	private int comparisons;
	private long start, end;

	public Algorithm(AlgorithmType algorithmType) {
		this.algorithmType = algorithmType;
	}

	/* Adds the unsorted list to the algorithm */
	public Algorithm buildWithList(ArrayList<Double> list) {
		this.listToSort = list;
		return this;
	}

	public void clear() {
		this.listToSort.clear();
		this.comparisons = 0;
		this.start = 0;
		this.end = 0;
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

	@SuppressWarnings("unchecked")
	public ArrayList<Double> getListToSort() {
		return (ArrayList<Double>) listToSort.clone();
	}

	public AlgorithmType getAlgorithmType() {
		return algorithmType;
	}

	public int getComparisons() {
		return comparisons;
	}

	public void addComparison() {
		this.comparisons++;
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
