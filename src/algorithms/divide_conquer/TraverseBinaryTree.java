package algorithms.divide_conquer;

import java.util.List;

public class TraverseBinaryTree {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		List<Integer> list = bt.getList(); 
		
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
		
		for(Integer items: list){
			bt.add(items);
		}
		
		bt.preorderTraverse(bt.getRoot());
		System.out.println();
		bt.inorderTraverse(bt.getRoot());
		System.out.println();
		bt.postorderTraverse(bt.getRoot());
	}
}
