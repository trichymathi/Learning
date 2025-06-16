package leetCodeProblems;

import java.util.HashMap;

public class Contains_Duplicate {

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		boolean flag = false;
		for (Integer l : nums) {
			if (map.get(l) == 1) {
				flag = false;
			} else {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		return flag;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		containsDuplicate(nums);

	}

}
