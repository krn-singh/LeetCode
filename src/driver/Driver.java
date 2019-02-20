package driver;

import java.util.Arrays;

import algoritm.P1_TwoSum;

public class Driver {

	public static void main(String[] args) {
		
		P1_TwoSum obj = new P1_TwoSum();
		int[] nums = {2,4,5,7,2,6};
		int[] result = obj.twoSum(nums, 11);
		Arrays.stream(result).forEach(i -> System.out.println(nums[i]));
	}

}
