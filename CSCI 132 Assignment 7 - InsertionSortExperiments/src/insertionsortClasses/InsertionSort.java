package insertionsortClasses;

public class InsertionSort {

	public static void insertionSort(Integer[] dataSet){
		int n = dataSet.length;
		for (int k = 1; k < n; k++){
			Integer currentValue = dataSet[k];
			int currentIndex = k;
			while (currentIndex > 0 && dataSet[currentIndex - 1] > currentValue){
				dataSet[currentIndex] = dataSet[currentIndex - 1];
				currentIndex--;
			}
			dataSet[currentIndex] = currentValue;
		}
	}
}
