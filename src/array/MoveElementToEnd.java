package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Two problems covered: 
 * (1): Move Element To End - AlgoExpert
 * (2): Move zeroes - LC- 283
 * */
public class MoveElementToEnd {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1,0,2,0,3,0,4,5);
		int toMove = 0;
		Iterator<Integer> itr = list.iterator();
		
		/*
		 * With Iterator
		 * Time: O(n), Space: O(1)
		 * Maintains the order
		*/

		/*
		int i = 0;
		while(itr.hasNext()) {
			int var = itr.next();
			if(var != toMove) {
				
				list.set(i++, var);
			}
		}
		while(i < list.size()) {
			list.set(i++, toMove);
		}
		System.out.println(list);
		*/
		
		/*
		 * With Two pointer approach
		 * Time: O(n), Space: O(1)
		 * Does not maintain the order
		 * */
		int left = 0;
		int right = list.size() - 1;
		while(left < right) {
			while(left < right && list.get(right) == toMove) right--;
			if(list.get(left) == toMove) {
				swap(left, right, list);
			}
			left++;
		}
		System.out.println(list);
	}
	
	public static void swap(int i, int j, List<Integer> list) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}
