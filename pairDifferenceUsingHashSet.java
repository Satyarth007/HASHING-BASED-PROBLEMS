import java.util.HashSet;
public class pairDifferenceUsingHashSet {
//	TC:- O(n)       SC:- O(n)
	public static void pairDiff(int []arr, int value) {
		HashSet<Integer> hs=new HashSet<>();
		for(int ele:arr) {
			hs.add(ele);
//Here to find the second element we need to find the sum of 'value' + 'ele' 
			//ex:- to find difference as 10:-
			//     second elemnet = 10+21 i.e = 31
			int secondElement=Math.abs(value+ele);
			if(hs.contains(secondElement)) {
				System.out.println("PAIR IS :: "+secondElement+" & "+ele);
				//return;  // if u put return statement then only one possible pair will be printed
			}
			
		}
	}

	public static void main(String[] args) {
		// pass the values
		int arr[]= {5,24,13,-2,31,21,3};
		int value=10;
		pairDiff(arr,value);
	}

}
