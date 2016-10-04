/**
 * @author David Walker
 * Oct 4, 2016
 * 2:54:42 PM
 */
package hacktoberfest2016;

/**
 * 
 */
//TODO Solve the problem!
public class Problem3 {
	
	//prints out how many repeated numbers are in array
	public static int matcher(int[] a){
		
		int i = 1;
		int count = 0;
		while(i < a.length){
			if(a[i] == a[i-1]){
				count++;
			}
		}
		return count;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4,5,6,7,8,9};
		int[] array2= {1,2,2,2,2,3,4,5,6,7};
		
		System.out.println(matcher(array1)); //should print out 0
		System.out.println(matcher(array2)); //should print out 3

		
	}

}
