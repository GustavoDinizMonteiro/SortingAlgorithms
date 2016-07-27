package main;

import java.util.Arrays;

import n_log.MergeSort;
import n_squared.RecursiveBubbleSort;
import util.AbstractSorting;

public class MainTest {
	public static void main(String[] args) {
		Integer[] s = {5, 4, 1, 8, 4, 0, 6, 7};
		Integer[] r = {5, 4, 0, 1, 4, 6, 8, 7};
		
		AbstractSorting<Integer> sort = new RecursiveBubbleSort<Integer>();
		sort.sort(s, 2, 6);
		System.out.println(Arrays.equals(s, r));
		
		Integer[] x = {5, 4, 1, 8, 4, 0, 6, 7};
		Integer[] y = {5, 0, 1, 4, 4, 6, 7, 8};
		sort.sort(x, 1, s.length - 1);
		System.out.println(Arrays.equals(x, y));
	}
}
