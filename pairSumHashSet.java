import java.util.HashSet;

public class pairSumHashSet {
	public static void pairSum(int arr[], int value) {
		HashSet<Integer> hs=new HashSet<>();
		for(int ele: arr) {
		  if(hs.contains(value-ele)) {
			  System.out.println("PAIR EXIST AS :: "+ele+" + "+(value-ele)+" --> "+value);
		  }
			  hs.add(ele);
		  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,1,5,3};
		int value=5;
		pairSum(arr,value);

	}

}
