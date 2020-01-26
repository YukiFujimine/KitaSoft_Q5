import java.util.*;
public class Q5_7{
		public static void main(String[] args){
				int kuku[][] = new int[9][9];
				for(int i=0 ; i<9 ; i++){
						for( int j=0 ; j< 9 ; j++ ){
								kuku[i][j]=(i+1)*(j+1);
						}
				}
				System.out.print("1~9の数値を入力してください> x=");
				int x=new Scanner(System.in).nextInt();
				System.out.print("1~9の数値を入力してください> y=");
				int y=new Scanner(System.in).nextInt();

				System.out.println("x*y="+kuku[x-1][y-1]+"です");
		}
}

