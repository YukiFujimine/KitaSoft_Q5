import java.util.*;
public class Q5_4{
		public static void main(String[] args){
				int[] log=new int[10];
				int sum=0;
				int i=0;
				for(i=0;i<log.length;i++){
						if(sum>=100){
								break;
						}
						System.out.print("数値を入力してください>");
						int input=new Scanner(System.in).nextInt();
						log[i]=input;
						sum+=input;
				}
				for(int j=0;j<=i-1;j++){
						System.out.print(log[j]+",  ");
				}
		}
}

