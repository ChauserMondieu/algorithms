package algorithms.divide_conquer;

public class Hanio {
	public static void main(String[] args) {
		String x = "column_1";
		String y = "column_2";
		String z = "column_3";
		hanio(5, x, y, z);
	}
	
	public static void hanio(int n, String x, String y, String z){
		if(n<1){
			System.out.println("error");
		}else if(n==1){
			System.out.println("move piece 1: " + x + " -> " +z);
		}else{
			hanio(n-1, x, z, y);
			System.out.println("move: piece "+ n + ": " + x + " -> " +z);
			hanio(n-1, y, x, z);
		}
	}
}
