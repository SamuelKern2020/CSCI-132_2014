package sortItOut;

public class QuickInsertSort {
	 public static <T extends Comparable<T>> void quickSort(T[] table, int first, int last){
	        if (first < last) {
	            int pivIndex = partition(table, first, last);
	            if(first - (pivIndex-1) > 11 ){
	            	quickSort(table, first, pivIndex-1);
	            }
	            else{
	            	InsertionSort.insertionSort(table, first, pivIndex - 1);
	            }
	            if((pivIndex+1) - last >11){
		            quickSort(table, pivIndex+1, last);
	            }
	            else {
	            	InsertionSort.insertionSort(table, pivIndex+1, last);
	            }
	            
	        }
	    }
	    
	    protected static <T extends Comparable<T>> int partition(T[] table, int first, int last){
	        T pivot = table[first];
	        int up = first;
	        int down = last;
	        do {
	            while((up < last) && (pivot.compareTo(table[up]) >= 0)){
	                up++;
	            }
	            while (pivot.compareTo(table[down]) < 0) {
	                down--;
	            }
	            if (up < down) {
	                swap(table, up, down);
	            }
	        } while (up < down);
	        swap(table, first, down);
	        return down;            
	    }
	    
	    private static <T extends Comparable<T>> void swap (T[] table, int first, int last){
	        T temp = table[first];
	        table[first] = table[last];
	        table[last] = temp;
	    }
}
