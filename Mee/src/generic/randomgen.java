package generic;

import java.util.Random;

public class randomgen {
	
	public int rand() {
		String nums = "1234567890";
		Random r = new Random();
		return nums.charAt(r.nextInt(nums.length()));
	}
	
//	public int randnth(int val) {
//		Random r = new Random();
//		int num =  r.nextInt(val);
//		return num+1;
//	}
}
