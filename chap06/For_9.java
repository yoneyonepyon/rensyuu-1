import java.util.Scanner;

public class For_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
//forループ		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1 ; i<=2 ;i++) {
			System.out.println(i+"回の表の日ハムの得点は？");
			sum1=sum1+sc.nextInt();
			System.out.print(i+"回の表の楽天の得点は？ ");
			sum2=sum2+sc.nextInt();
		}	
//			sum1 = a+c;
//			sum2 = b+d;		
			
		
				
		System.out.println("日ハム："+sum1+"点、楽天："+sum2+"点");
				
		if(sum1 > sum2) {
			System.out.println("日ハムの勝ち");		
		}else if(sum1 < sum2) {		
			System.out.println("楽天の勝ち");
		}else if(sum1==sum2) {
			System.out.println("引き分け");
		}		
		
		sc.close();
	}
	
}
