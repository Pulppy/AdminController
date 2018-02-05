package com.pulppy.user.actionTest;

import java.util.Random;
import java.util.Scanner;

import com.pulppy.user.model.InteractiveAccount;

public class TestFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Username");
		String username = sc.nextLine();

		System.out.println("Enter Your Password");
		String password = sc.nextLine();

		System.out.println("Enter Your Email");
		String email = sc.nextLine();

		sc.close();

		InteractiveAccount test = new InteractiveAccount();
		String a = test.createAccount(email, password, username);
		System.out.println(a);
	}

}
