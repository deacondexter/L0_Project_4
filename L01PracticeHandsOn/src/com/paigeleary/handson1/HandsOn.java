package com.paigeleary.handson1;

public class HandsOn {

	public static void main(String[] args) {
		boolean isSunny = false;
		boolean atBeach = false;

		// if it's sunny
		if (isSunny) {
			// print "Wear sunglasses!"
			System.out.println("Wear sunglasses!");
			// if at the beach
			if (atBeach) {
				// print "Wear sunblock!"
				System.out.println("Wear sunblock!");
			}
			// else
			else {
				// print "Don't need sunblock."
				System.out.println("Don't need sunblock.");
			}
		}
		// else
		else {
			// print "Don't wear sunglasses."
			System.out.println("Don't wear sunglasses.");
			// if at the beach
			if (atBeach) {
				// print "Come back tomorrow."
				System.out.println("Come back tomorrow.");
			}
			// else
			else {
				// print "Don't go to the beach."
				System.out.println("Don't go to the beach.");
			}
		}

	}

}
