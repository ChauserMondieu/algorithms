package algorithms.divide_conquer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinarySearch {
	private List<Integer> list = new ArrayList<Integer>();
	private int index;
	
	public List<Integer> getList(){
		return this.list;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public boolean quickSort(List<Integer> list, int low, int high){
		int i = low;
		int j = high;
		int std = list.get(low);
		if(low > high){
			return false;
		}
		while(i < j){		
			while(list.get(j)>std && i<j){
				j --;
			}
			if(i<j){
				list.set(i, list.get(j));
			}
			while(list.get(i)<std && i<j){
				i ++;
			}
			if(i < j){
				list.set(j, list.get(i));				
			}
		}
		list.set(i, std);
		if(i-1 > low){		
			quickSort(list, low, i-1);	
		}
		if(j+1 < high){
			quickSort(list, j+1, high);
		}
		return true;
	}
	
	public boolean binarySearch(List<Integer> list, int val, int low, int high){
		int mid = (int)(low+high)/2;
		if(val == list.get(mid)){
			this.index = mid;
			return true;
		}else if(val<list.get(mid)){
			binarySearch(list, val, low, mid);
		}else{
			binarySearch(list, val, mid, high);
		}
		return true;
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		List<Integer> list = bs.getList();
		list.add(2);
		list.add(5);
		list.add(34);
		list.add(23);
		list.add(25);
		list.add(14);
		list.add(20);
		list.add(15);
		list.add(4);
		list.add(12);
		list.add(6);
		list.add(17);
		list.add(33);
		list.add(10);
		list.add(1);
		
		bs.quickSort(list, 0, list.size()-1);
		for(Integer items: list){
			System.out.print(items + "-> ");
		}
		System.out.println();
		bs.binarySearch(list, 25, 0, list.size()-1);
		System.out.println(bs.index+1);
	}
}
