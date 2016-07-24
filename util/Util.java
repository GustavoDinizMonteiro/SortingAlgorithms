package util;

public class Util {
	public static void swap( Object[] array, int leftIndex, int rightIndex){
		if(array == null)
			throw new IllegalArgumentException();
		
		Object temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
	
	
	public static boolean validaton (Object[] array, int leftIndex, int rightIndex){
		if(array == null)
			return false;
		
		if(leftIndex < 0)
			return false;
		
		if(leftIndex >= rightIndex)
			return false;
		
		if(rightIndex >= array.length)
			return false;
		
		return true;
	}
}
