//10 個の数値を入力する。
//入力された数値を偶数と奇数に分類して表示する。
import java.util.*;
public class Q5_3{
		public static void main(String[] args){
				int[] log=new int[10];
				for(int i=0;i<log.length;i++){
						System.out.print("数値を入力してください > ");
						int input=new Scanner(System.in).nextInt();
						log[i]=input;
				}
				System.out.print("偶数:");
				for(int output:log){
						if(output%2==0){
								System.out.print(output+" ");
						}
				}
				System.out.println();
				System.out.print("奇数:");
				for(int output:log){
						if(output%2!=0){
								System.out.print(output+" ");
						}
				}
		}
}

