import java.util.Scanner;

public class For_6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//整数値を入力します
		int num = sc.nextInt();
		
		int sum = 0;
         
        //以下にプログラムを作成します
//		int counter = 0;
		for(int i = 1;i<=num;i++) {
			
			System.out.print(i +" ");
//			counter =counter + 1;
			sum = sum + i;
			
		sc.close();
    }
		System.out.println("");
		System.out.println("合計値："+sum);
    }
}
