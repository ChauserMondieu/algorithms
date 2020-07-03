package algorithms.divide_conquer;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
	
	private List<Integer> list = new LinkedList<Integer>();
	private Node root;
	private int size;
	private boolean flag = true;
	
	public Node getRoot(){
		return this.root;
	}
	
	public List<Integer> getList(){
		return this.list;
	}
	
	class Node{
		Node parent;
		Node leftChild;
		Node rightChild;
		private int val;
		
		public int getVal(){
			return this.val;
		}
		
		
		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
	
	public boolean add(int val){
		Node node;
		Node pointer;
		if(null==this.root){
			node = new Node(val);
			this.root = node;
			size ++;
			return true;
		}else{
			node = this.root;
			pointer = this.root;
			while(null!=node){
				pointer = node;
				if(node.getVal()<val){
					node = node.leftChild;
					this.flag = true;
				}else if(node.getVal()==val){
					System.out.println("already exist!");
					return true;
				}else{
					node = node.rightChild;
					this.flag = false;
				}
			}
			node = new Node(val);
			node.parent = pointer;
			if(flag){
				pointer.leftChild = node;
			}else{		
				pointer.rightChild = node;
			}
			this.size ++;
			return true;
		}
	}
	
	public boolean preorderTraverse(Node node){
		if(null==node){
			return true;
		}else{
			System.out.print(node.getVal()+" -> ");
			preorderTraverse(node.leftChild);
			preorderTraverse(node.rightChild);	
		}
		return true;
	}
	
	public boolean inorderTraverse(Node node){
		if(null==node){
			return true;
		}else{
			inorderTraverse(node.leftChild);
			System.out.print(node.getVal()+" -> ");
			inorderTraverse(node.rightChild);	
		}
		return true;
	}
	
	public boolean postorderTraverse(Node node){
		if(null==node){
			return true;
		}else{
			postorderTraverse(node.leftChild);
			postorderTraverse(node.rightChild);	
			System.out.print(node.getVal()+" -> ");
		}
		return true;
	}
	
	public void printNumber(){
		
	}
	
}
