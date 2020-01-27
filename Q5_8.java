//整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
import java.util.*;
public class Q5_8{
		public static void main(String[] args){
				int[] log=new int[10];
				for(int i=0;i<log.length;i++){							//10回入力を求める
						System.out.print("整数を入力してください> ");
						int userInput=new Scanner(System.in).nextInt();
						log[i]=userInput;								//入力値を配列に入れる
				}
				for(int i=0;i<log.length-1;i++){					//開始点の移動
						for(int j=0;j<log.length-1-i;j++){			//開始点から要素の終わりまで大小チェック	
								if(log[i]>log[i+j+1]){
										int temp=log[i];
										log[i]=log[i+j+1];
										log[i+j+1]=temp;
								}
						}
				}
				for(int output:log){								//並べ替えた配列を順に出力
						System.out.printf("%3d",output);
				}
		}
}

