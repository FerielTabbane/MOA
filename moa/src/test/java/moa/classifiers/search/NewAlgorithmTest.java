package moa.classifier.search;
import org.junit.Test;
import static org.junit.Assert.*;
public class NewAlgorithmTest {
    @Test
    public void testBinarySearchWithPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
		int x = 3;
        int expectedResult = 2;
		int result = NewAlgorithm.binarySearch(arr, x);
		assertEquals(expectedResult, result);
    }
    @Test
    public void testBinarySearchWithNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, -5};
		int x = -3;
		int expectedResult = -1;
		int result = NewAlgorithm.searchwithConstraints(arr, x);
		assertEquals(expectedResult, result);
    }
    @Test
    public void testBinarySearchWithElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
		int x = 6;
		int expectedResult = -1;
		int result = NewAlgorithm.binarySearch(arr, x);
		assertEquals(expectedResult, result);
    }
    @Test
    public void testBinarySearchWithEmptyArray() {
        int[] arr = {};
		int x = 6;
		int expectedResult = -1;
		int result = NewAlgorithm.searchwithConstraints(arr, x);
		assertEquals(expectedResult, result);
    }
	
	
}

