import java.util.HashSet;

public class missingValue {

	public static void answer(int []arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		HashSet<Integer> hs=new HashSet<>();
		for(int ele:arr) {
			hs.add(ele);
			if(max<ele) {
				max=ele;
			}
			if(min>ele) {
				min=ele;
			}
		}
		for (int i=min; i<=max ; i++) {
				if (!hs.contains(i)) {
				System.out.print(i+" ");
				}
			}
		
	}
	public static void main(String[] args) {
		/* 
		 Given an array, find the maximum and minimum value in the array
		 and also find the values in range minimum and maximum that are absent in the
         array. 
		 */
		int [] arr= {1,2,4,8,5,6};
		answer(arr);
	}

}
