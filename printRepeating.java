import java.util.*;
public class printRepeating {
	public static void answer(int []arr) {
		HashSet<Integer> hs=new HashSet<>();
		for(int ele:arr) {
			if(hs.contains(ele)) {
				System.out.print(ele+" :: ");
			}else {
				hs.add(ele);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,3,4,15,22,2,3};
		answer(arr);
	}

}
