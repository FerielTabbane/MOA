import junit.framework.TestCase;
import moa.classifiers.search.NewAlgorithm;

public class NewAlgorithmTest extends TestCase {
	 public void testBinarySearchWithPositiveNumbers() {
	        int[] arr = {1, 2, 3, 4, 5};
			int x = 3;
	        int expectedResult = 2;
			int result = NewAlgorithm.binarySearch(arr, x);
			assertEquals(expectedResult, result);
	    }
	    
	    public void testBinarySearchWithNegativeNumbers() {
	        int[] arr = {-1, -2, -3, -4, -5};
			int x = -3;
			int expectedResult = -1;
			int result = NewAlgorithm.searchwithConstraints(arr, x);
			assertEquals(expectedResult, result);
	    }
	    
	    public void testBinarySearchWithElementNotFound() {
	        int[] arr = {1, 2, 3, 4, 5};
			int x = 6;
			int expectedResult = -1;
			int result = NewAlgorithm.binarySearch(arr, x);
			assertEquals(expectedResult, result);
	    }
		
		public void testBinarySearchWithEmptyArray(){
			
			int[] arr= {};
			int x=6;
			int expectedResult=-1;
			int result=NewAlgorithm.searchwithConstraints(arr,x);
			assertEquals(expectedResult, result);
			
		}
	    
	   
	}