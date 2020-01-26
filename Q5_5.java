import java.util.*;
public class Q5_5{
		public static void main(String[] args){
				System.out.print("数値を入力してください>");
				int value=new Scanner(System.in).nextInt();
				int binary[]=new int[16];
				for(int i=binary.length-1;i>0;i--){
						binary[i]=value%2;
						value/=2;
				}
				for(int i=0;i<binary.length;i++){
						System.out.print(binary[i]);
				}
		}
}

