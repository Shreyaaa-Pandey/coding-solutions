/*public class array{
	public static void main(String[] args){
		int[] num = {10,20,30,40,50};
		for (int n: num){
			System.out.println(n);
		}
	}
}*/

import java.util.Scanner;

public class array{
	public static void main(String[] args){
	 	Scanner sc = new Scanner(System.in);
		int i;
		int[][] x ={{1,2},{3,4}};
		for ( i=0;i<x.length;i++){
			for (int j=0;j<x[i].length;j++){
				System.out.println(x[i][j]);
			}
		}
	}
}