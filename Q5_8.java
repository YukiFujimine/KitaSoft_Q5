import java.util.*;
public class Q5_8{
		public static void main(String[] args){
				int[] log=new int[10];
				for(int i=0;i<10;i++){
						System.out.print("整数を入力してください> ");
						int userInput=new Scanner(System.in).nextInt();
						log[i]=userInput;
				}
				for(int i=0;i<log.length-1;i++){
						for(int j=0;j<log.length-1-i;j++){
								if(log[i]>log[i+j+1]){
										int temp=log[i];
										log[i]=log[i+j+1];
										log[i+j+1]=temp;
								}
						}
				}
				for(int output:log){
						System.out.printf("%3d",output);
				}
		}
}

