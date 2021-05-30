class Solution {
    public static boolean isPalindrome(int x) {

		String num = String.valueOf(x);
		StringBuffer sb = new StringBuffer(num);
		
		if(sb.reverse().toString().equals(num)) {
			return true;			
		}
		return false;
	}

}