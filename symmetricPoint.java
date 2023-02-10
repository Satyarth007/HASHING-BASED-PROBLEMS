/*Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d.
For example, (10, 20) and (20, 10) are symmetric. Given an array of pairs find all symmetric pairs in it. 
It may be assumed that the first elements of all pairs are distinct.
Example: 

Input: a[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
Output: Following pairs have symmetric pairs
        (30, 40)
        (5, 10)
        
*/
// my code is more easy to understand:-
import java.util.HashMap;
public class symmetricPoint {

	public static void main(String[] args) {
		int arr[][]= {{11,20},{30,40},{5,10},{40,30},{10,5}};
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int[] e:arr) {

			if(hm.containsKey(e[1]) && hm.containsValue(e[0]))
				System.out.println(e[1]+" "+hm.get(e[1]));
			
			else hm.put(e[0],e[1]);
		}

	}

}
