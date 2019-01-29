import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//整数値を入力します
		int num = sc.nextInt();
         
		int counter = num;
		for(int i = num ; i>=1 ;i--) {
			
			System.out.println(i);
			counter = counter - 1;
		sc.close();
    }
    }
}

