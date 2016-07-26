package n_linear;

import util.Util;

public class CountingSort {
	public void sort(Integer[] array,int leftIndex, int rightIndex) {
		if(Util.validation(array, leftIndex, rightIndex)){
			int bigger = 0;
			for (int j = leftIndex; j <= rightIndex; j++) {
				if(array[j].compareTo(bigger) > 0)
					bigger = array[j];
			}
			countingSort(array, bigger, leftIndex, rightIndex);
		}
	}
	
	private void countingSort(Integer[] array, int max, int leftIndex, int rightIndex){
		int aux[] = new int[max + 1];
		
		for (int i = leftIndex; i < rightIndex + 1; i++)
			aux[array[i]]++;
		
		for (int i = 1; i <= max; i++)
			aux[i] += aux[i-1];
		
		int ordened[] = new int[array.length];
		for (int i = rightIndex; i >= leftIndex; i--){
			ordened[--aux[array[i]]] = array[i];
		}
		
		int count = 0;
		for (int i = leftIndex; i < rightIndex + 1; i++) {
			array[i] = ordened[count++];
		}
	}
}
