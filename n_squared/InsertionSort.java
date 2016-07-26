package n_squared;

import util.AbstractSorting;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++) {
			T key = array[i];
			
			int j = i - 1;
			while(j >= leftIndex && array[j].compareTo(key) >= 1){
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = key;
		}
	}
}
