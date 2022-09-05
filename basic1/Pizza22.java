package com.raystech.basic1;

public class Pizza22 {
	public static void main(String[] args) {
		int money = 99;
		if (money > 100 && money <200) {
			System.out.println("wow i can buy average the pizza");
		} else if (money >=200 && money < 400) {
			System.out.println("i can buy medium pizza");
		} else if (money >= 400 && money < 1000) {
			System.out.println("i can buy large pizza");
		} else if (money > 1000 && money <= 1500){
			System.out.println("i can buy the special pizza");
		} else if(money>1500){
			System.out.println("i can buy bada wala pizza");
		}
		else {
			System.out.println("oh! i cant buy the pizza");
		}
	}
}
