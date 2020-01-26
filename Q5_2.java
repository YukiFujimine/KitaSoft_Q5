import java.util.*;
public class Q5_2{
		public static void main(String[] args){
				int[] log=new int[10];
				for(int i=9;i>=0;i--){
						System.out.print("数値を入力してください > ");
						int input=new Scanner(System.in).nextInt();
						log[i]=input;
				}
				for(int output:log){
						System.out.println(output);
				}
		}
}

