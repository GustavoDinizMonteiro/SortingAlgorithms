package n_squared;

import util.AbstractSorting;
import util.Util;

public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (Util.validation(array, leftIndex, rightIndex)) {
			
			int gap = rightIndex - leftIndex;
			boolean swapped = true;
			int i = 0;

			while (gap > 1 || swapped) {
				if (gap > 1) {
					gap = (int) (gap / 1.25);
				}

				i = leftIndex;
				swapped = false;
				while (i + gap < rightIndex + 1) {
					if (array[i].compareTo(array[i + gap]) > 0) {
						Util.swap(array, i, i + gap);
						swapped = true;
					}
					i++;
				}
			}
		}
	}
}
