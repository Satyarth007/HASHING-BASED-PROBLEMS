import java.util.HashSet;

// time complexity :- O(n)
public class removeDuplicates {
	public static int[] answer(int []arr) {
		HashSet<Integer> hs=new HashSet<>();
		for(int ele:arr) {
			if(hs.contains(ele)) {
				continue;						
			}else {
				hs.add(ele);
			}
		}
		int []returnAnswer=new int[hs.size()];
		int i=0;
		for(Integer ele:hs) {
			returnAnswer[i]=ele;
			i++;
		}
		return returnAnswer;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,3,4,15,22,2,3};
		int[]ans=answer(arr);
		for(int ele:ans) {
			System.out.print(ele+" : ");
		}
	}

}
