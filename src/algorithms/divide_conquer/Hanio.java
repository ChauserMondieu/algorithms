package algorithms.divide_conquer;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Hanio {
	public static void main(String[] args) {
		String path = "E:/JAVA/basic/new.txt";
		File dst = new File(path); 
		BufferedWriter bw = null;
		
		String x = "column_1";
		String y = "column_2";
		String z = "column_3";
		
		try {
			 bw = new BufferedWriter(
					new OutputStreamWriter(
						new FileOutputStream(dst),"utf-8"));		
			hanio(5, x, y, z, bw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(null != bw){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		}
	}
	
	public static void hanio(int n, String x, String y, String z, 
			BufferedWriter bw) throws IOException{
		if(n<1){
			System.out.println("error");
		}else if(n==1){
			String str = "move piece 1: " + x + " -> " + z;
			System.out.println("move piece 1: " + x + " -> " +z);
			bw.write(str);
			bw.newLine();
			bw.flush();
		}else{
			hanio(n-1, x, z, y, bw);
			System.out.println("move: piece "+ n + ": " + x + " -> " +z);
			String str = "move: piece "+ n + ": " + x + " -> " +z;
			bw.write(str);
			bw.newLine();
			hanio(n-1, y, x, z, bw);
			bw.flush();
		}
	}
}
