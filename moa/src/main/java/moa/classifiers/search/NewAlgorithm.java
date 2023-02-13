package moa.classifiers.search;
public class NewAlgorithm {
	
	public static int binarySearch(int[] arr, int x) {
    int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x)
				return m;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
    }
    return -1;
	}
	
	public  boolean verifyArray(int[] arr, int x) {
		
		for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            System.out.println("Le tableau ne peut pas contenir de nombres négatifs.");
            return false;
        }
		
    
	}
	return true;
	}
	public int searchwithConstraints(int[] arr, int x) {
		
		
		if (verifyArray(arr, x)) {
            System.out.println("Le tableau ne peut pas contenir de nombres négatifs.");
            return -1;
        }
		binarySearch(arr, x);
	
		return -1;
	
	}


 
	
}