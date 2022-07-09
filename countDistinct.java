import java.util.*;
public class countDistinct {
	
	public static int count(int []arr) {
		HashSet<Integer> hs=new HashSet<>();
		for(int element:arr) {
			hs.add(element);
		}
		return hs.size();
	}

	public static void main(String[] args) {
		//counting the no. of distinct elements present in an array.
// NOTE:-	BRUTE FORCE - Time Complexity is O(n^2)
// NOTE:-   Hashing approach- Time Complexity is O(n)
		int arr[]= {1,2,3,3,1,4,2,6,9,11};
		System.out.println("No. of distinct elements : "+count(arr));
		
// we can also print the values by printing the hashset hs values .
	}

}
