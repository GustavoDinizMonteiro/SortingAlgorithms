package n_squared;

import util.AbstractSorting;
import util.Util;

public class OddEvenBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(Util.validation(array, leftIndex, rightIndex)){
			boolean sorted = true;
			while (sorted) {
				sorted = false;

				for (int i = leftIndex; i < rightIndex; i += 2) {
					if (array[i].compareTo(array[i + 1]) > 0) {
						Util.swap(array, i, i + 1);
						sorted = true;
					}
				}

				for (int j = leftIndex + 1; j < rightIndex; j += 2) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						Util.swap(array, j, j + 1);
						sorted = true;
					}
				}
			}	
		}
		
	}
	
}
