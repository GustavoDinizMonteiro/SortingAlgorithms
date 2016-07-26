package n_log;

import util.AbstractSorting;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array,int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex){
			int midlle = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, midlle);
			sort(array, midlle + 1, rightIndex);
			merge(array, leftIndex, midlle, rightIndex);
		}
	}
	
	private void merge(T[] array, int start, int midlle, int end) {
		T[] helper = (T[]) new Comparable[end + 1];
		
		for(int w = start; w < end + 1; w++){
			helper[w] = array[w];
		}
		
		int k = start;
		int i = start;
		int j = midlle + 1;
		
		while(i <= midlle && j <= end){
			if(helper[i].compareTo(helper[j]) <= 0){
				array[k] = helper[i];
				i++;
			}else{
				array[k] = helper[j];
				j++;
			}
			k++;
		}
	}
}
