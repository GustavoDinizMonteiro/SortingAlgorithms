package n_squared;

import util.AbstractSorting;
import util.Util;

public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validation(array, leftIndex, rightIndex)){
			
			boolean exchange = true;
			for(int i = rightIndex-1; i >= leftIndex + 1 && exchange; i--){
				exchange = false;
				
				for(int j = leftIndex; j < i + 1; j++){
					if(array[j].compareTo(array[j+1]) > 0){
						Util.swap(array, j, j+1);
						exchange = true;
					}
				}
			}
		}
	}

}
