import java.util.HashMap;
public class symmetricPoint {

	public static void main(String[] args) {
		int arr[][]= {{11,20},{30,40},{5,10},{40,30},{10,5}};
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int[] e:arr) {
		//	if(hm.isEmpty()) hm.put(e[0],e[1]);
			
			if(hm.containsKey(e[1]) && hm.containsValue(e[0]))
				System.out.println(e[1]+" "+hm.get(e[1]));
			
			else hm.put(e[0],e[1]);
		}

	}

}
