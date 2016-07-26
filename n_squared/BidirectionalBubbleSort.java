package n_squared;

import util.AbstractSorting;
import util.Util;

public class BidirectionalBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
	       while (leftIndex < rightIndex)
	       {
	          for (int pos = leftIndex; pos < rightIndex; pos++)
	          {
	             if (array[pos].compareTo(array[pos + 1]) == 1)
	                Util.swap(array, pos, pos + 1);
	          }
	          rightIndex--;


	          for (int pos = rightIndex; pos > leftIndex; pos--)
	          {
	             if (array[pos].compareTo(array[pos - 1]) == -1)
	               Util.swap(array, pos, pos - 1);
	          }
	          leftIndex++;
	       }
	}
}
