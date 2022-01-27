package study.practice.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random ran= new Random();
		int ranNum=ran.nextInt(10);
//		System.out.println(ranNum);
		guessNum(ranNum,5);

	}

	private static void guessNum(int ranNum,int chance) {
		
		if(chance >0) {
			Scanner scn =new Scanner(System.in);
			System.out.println("Guess a number");
			int num=scn.nextInt();
			if(num >ranNum) {
				System.out.println("Wrong ---hint number is less than");
				guessNum(ranNum,chance-1);
			}
			else if(num<ranNum) {
				System.out.println("Wrong ---hint number is greater than");
				guessNum(ranNum,chance-1);
			}
			else if(num == ranNum){
				System.out.println("!! YOU WIN !!");
				return;
			}
		}
		else
			System.out.println("Your guesses Over!!\n Your Number was :"+ranNum);
	}

}
