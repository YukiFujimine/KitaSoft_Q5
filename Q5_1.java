import java.util.*;
public class Q5_1{
		public static void main(String[] args){
				int[] doubleNum=new int[10];
				for(int i=0;i<10;i++){
						System.out.print("数値を入力してください > ");
						int input=new Scanner(System.in).nextInt();
						doubleNum[i]=input*2;
				}
				for(int ans:doubleNum){
						System.out.println(ans);
				}
		}
}

