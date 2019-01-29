
public class Count7 {
//* 二重for文
	public static void main(String[] args) {
		for(int ｊ = 1; ｊ <= 1; ｊ++) {
			System.out.print("*");
		}
		System.out.println("");//改行させる
		for(int ｊ = 1; ｊ <= 2; ｊ++) {
			System.out.print("*");
		}
		System.out.println("");//改行させる
		for(int ｊ = 1; ｊ <= 3; ｊ++) {
			System.out.print("*");
		}
		System.out.println("");//改行させる
		
		for(int i=1;i<=3;i++) {
			for(int ｊ = 1; ｊ <= i; ｊ++) {
				System.out.print("*");
			}
			System.out.println("");//改行させる
		}
	}
	
}
