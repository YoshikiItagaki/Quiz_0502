package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {

	public static void main(String[] args) {

		//1.
		Random random = new Random();
		int fortune = random.nextInt(2);
		fortune += fortune;

		switch(fortune) {
			case 1:
				System.out.println("吉です");
				break;
			case 2:
				System.out.println("中吉です");
				break;
			case 3:
				System.out.println("大吉です");
				break;
			default:
				System.out.println("凶です");
				break;

		}

		//2.
			for(int number=7; number < 100; number +=7 ) {
				System.out.println(number);
			}

		//3
			for(int i = 1; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.print(i*j + "\t");
				}
				System.out.print("\n");

			}


	}

}
