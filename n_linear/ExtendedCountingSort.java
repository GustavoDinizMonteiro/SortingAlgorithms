package n_linear;

import util.Util;

public class ExtendedCountingSort {
	public void sort(Integer[] array,int leftIndex, int rightIndex) {
		if(Util.validation(array, leftIndex, rightIndex)){
			int bigger = 0;
			int smaller = 0;
			
			for (int j = leftIndex; j <= rightIndex; j++) {
				if(array[j] > bigger)
					bigger = array[j];
				
				if(array[j] < smaller)
					smaller = array[j];
			}
			
			smaller = Math.abs(smaller);
			bigger = Math.abs(bigger);
			
			countingSort(array, smaller, bigger, leftIndex, rightIndex);
		}
	}
	
	private void countingSort(Integer[] array, int min, int max, int leftIndex, int rightIndex){
		int aux[] = new int[min + max + 1];
		
		for (int i = leftIndex; i < rightIndex + 1; i++)
			aux[array[i] + min]++;
		
		for (int i =  1; i <= min + max; i++)
			aux[i] += aux[i-1];
		
		int ordened[] = new int[array.length];
		for (int i = rightIndex; i >= leftIndex; i--){
			ordened[--aux[array[i] + min]] = array[i];
		}
		
		int count = 0;
		for (int i = leftIndex; i < rightIndex + 1; i++) {
			array[i] = ordened[count++];
		}
	}
}
