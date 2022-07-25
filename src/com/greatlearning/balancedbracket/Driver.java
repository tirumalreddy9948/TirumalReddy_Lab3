package com.greatlearning.balancedbracket;

import java.util.Scanner;

import com.greatlearning.balancedbracket.*;

public class Driver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// String str = "(](())";
		System.out.println("Enter the brackets of your choice :");
		String str = input.nextLine();

		if (BalancedBracketsService.balancedParenthesis(str)) {
			System.out.println("The entered Strings contains Balanced Brackets ");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		}
	}

}

