package n_squared;

import util.AbstractSorting;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		T lower;
		int lowerIndex;
		
		for(int i = leftIndex; i < rightIndex; i++){
			lower = array[i];
			lowerIndex = i;
			
			for(int j = i+1; j <= rightIndex; j++){
				if(array[j].compareTo(lower) < 0){
					lower = array[j];
					lowerIndex = j;
				}
			}
			
			array[lowerIndex] = array[i];
			array[i] = lower;
		}
		
	}

}
