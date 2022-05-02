package jp.co.aforce.practice;

public class PracticeTest2 {

	public static void main(String[] args) {

		//1.
		final double TAX = 0.1;
		System.out.println(TAX);

		//2.
		int x = 480;
		double price = (double)x + (double)x * TAX;
		System.out.println(price);

		//3.
		String name = "Yoshiki";
		System.out.println(name);

		//4.
		String phrase_1 = "この商品の値段は";
		String phrase_2 = "円です。";
		System.out.println(phrase_1 + price + phrase_2);

		//5.
		/*double型と対照的に、intのデータ型は小数点以下の数値データを格納できずに
		 * エラーを起こしてしまう。
		 * 例えば、double型で宣言した変数heightは152.5という
		 * 小数点を含む数値データを格納している。
		 * しかしながら、このデータをint型の変数myHeightにそのまま代入してしまうと
		 * 小数点以下の部分を格納することができない。
		 * その結果、double型のデータをint型のデータに変換するときに誤差が発生し、
		 * それがエラーとなってしまう。
		*/
	}

}
