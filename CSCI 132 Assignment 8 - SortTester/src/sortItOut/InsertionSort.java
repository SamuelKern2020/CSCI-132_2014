package sortItOut;

public class InsertionSort {

	public static <T extends Comparable<T>> void insertionSort(T[] dataSet, int first, int last){
		
		for (int k = first; k < last; k++){
			T currentValue = dataSet[k];
			int currentIndex = k;
			while (currentIndex > 0 && dataSet[currentIndex - 1].compareTo(currentValue) > 0 ){
				dataSet[currentIndex] = dataSet[currentIndex - 1];
				currentIndex--;
			}
			dataSet[currentIndex] = currentValue;
		}
	}
}
