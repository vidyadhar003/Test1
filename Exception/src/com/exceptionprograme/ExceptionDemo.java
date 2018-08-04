package com.exceptionprograme;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int i = 10 / 0;

			System.out.println(i);

			String a = args[1];

			System.out.println(a);

			Integer ab = new Integer("aba");

			System.out.println(ab);

			Object obj = new Object();

			ExceptionDemo ex = (ExceptionDemo) obj;
			System.out.println(ex);
		} catch (ArithmeticException | NumberFormatException | ClassCastException | NullPointerException e) {
			System.out.println("All exceptions are handled");
			e.printStackTrace();
		}
	}
}
