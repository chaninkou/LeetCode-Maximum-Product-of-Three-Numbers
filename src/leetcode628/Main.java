package leetcode628;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {10,7,12,15,1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMaxProductOfThree solution = new FindMaxProductOfThree();
		
		System.out.println("Solution: " + solution.maximumProduct(nums));
	}
}
