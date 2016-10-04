/**
 * @author David Walker
 * Oct 4, 2016
 * 2:53:38 PM
 */
package hacktoberfest2016;

/**
 * 
 */
//TODO Solve the problem!
public class Problem1 {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}
		while (x != 0) {
			int l = x / div;
			int r = x / 10;

			if (l != r) {
				return false;
			}
			x = (x % div) / 10;
			div /= 100;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*These are your test cases. There is nothing wrong with them.*/
		System.out.println(isPalindrome(0)); //should be true
		System.out.println(isPalindrome(23)); //should be false
		System.out.println(isPalindrome(777)); //should be true
		System.out.println(isPalindrome(1001)); //should be true
		System.out.println(isPalindrome(2001)); //should be false

	}

}
