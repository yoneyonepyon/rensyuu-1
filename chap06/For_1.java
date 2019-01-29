import java.util.Scanner;

public class For_1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//整数値を入力します
		int num = sc.nextInt();
         
        //以下にプログラムを作成します
		int counter = 0;
		for(int i = 1;i<num+1 ;i++) {
			
			System.out.println(i);
			counter = counter + 1;
		sc.close();
    }
    }
}
