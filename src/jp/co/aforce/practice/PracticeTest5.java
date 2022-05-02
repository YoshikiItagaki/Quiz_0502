package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeTest5 {

	public static void main(String[] args) {
		//2.
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		//3.
		String myFavAnimal = "虎";

		if(animals.contains(myFavAnimal)) {
			System.out.println(myFavAnimal + "はリストに含まれています。");
		} else {
			System.out.println(myFavAnimal + "はリストに含まれていません。");
		}

		//4.
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの誕生月を入力してください。");
		int birthMonth = scanner.nextInt();

		switch(birthMonth) {
		case 1:
			System.out.println("１月：元日、成人の日");
			break;
		case 2:
			System.out.println("2月：建国記念の日、天皇誕生日");
			break;
		case 3:
			System.out.println("3月：春分の日");
			break;
		case 4:
			System.out.println("4月：昭和の日");
			break;
		case 5:
			System.out.println("5月：憲法記念日、みどりの日、こどもの日");
			break;
		case 6:
			System.out.println("6月：（なし）");
			break;
		case 7:
			System.out.println("7月：海の日、スポーツの日");
			break;
		case 8:
			System.out.println("8月：山の日");
			break;
		case 9:
			System.out.println("9月：敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("10月：（なし）");
			break;
		case 11:
			System.out.println("11月：文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("12月：（なし）");
			break;
		default:
			System.out.println("1～12で入力してください");
			break;

		}


	}

}
