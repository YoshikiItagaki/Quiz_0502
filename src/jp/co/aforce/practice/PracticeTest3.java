package jp.co.aforce.practice;

import java.util.HashMap;

public class PracticeTest3 {

	public static void main(String[] args) {

		//1.
		HashMap<String, String> employeesName = new HashMap<>();
		employeesName.put("1", "田中太郎");
		HashMap<String, String> employeesGender = new HashMap<>();
		employeesGender.put("1", "男性");
		HashMap<String, String> employeesAge = new HashMap<>();
		employeesAge.put("1", "27");

		//2.
		System.out.println(employeesName.get("1"));

	}

}
