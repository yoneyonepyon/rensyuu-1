
public class Count5 {

	public static void main(String[] args) {
		int counter = 0;//counter 宣言
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			counter = counter + 1;
		}
		System.out.println("");//改行させる
		System.out.println("end");
		System.out.println(counter);//for文繰り返し実行p29
	}
	
}
