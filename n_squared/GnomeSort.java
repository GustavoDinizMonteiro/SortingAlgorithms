package n_squared;

import util.AbstractSorting;
import util.Util;

public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validation(array, leftIndex, rightIndex)){
			
			for (int i = leftIndex; i <= rightIndex; i++) {
				int position = i;
				
				while(position > leftIndex && array[position - 1].compareTo(array[position]) > 0){
					Util.swap(array, position, position - 1);
					position--;
				}
			}
		}
		
	}
	
}
