package n_log;

import util.AbstractSorting;
import util.Util;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array,int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			int pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivot - 1);
			sort(array, pivot + 1, rightIndex); 
	    }
	}
	
	private int partition(T[] array, int start, int end) {
		T pivot = array[start];
		int i = start;
		for(int j = i + 1; j <= end; j++){
			if(array[j].compareTo(pivot) <= 0){
				i++;
				Util.swap(array, i, j);
			}
		}
		Util.swap(array, start, i);
		
		return i;
	}
}
