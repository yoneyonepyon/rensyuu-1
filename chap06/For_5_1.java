import java.util.Scanner;

public class For_5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//整数値を入力します
		int num = sc.nextInt();
		
		int counter = num;
		for(int i = 0 ; i<=num ;i++) {
			
			if(i%2 == 0) {
				System.out.print(i +" ");
			
			}

		}
		System.out.println("");
		sc.close();
	}
	
}
