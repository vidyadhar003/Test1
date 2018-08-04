package com.exceptionprograme;

public class Demo {

	public static void main(String[] args) {

		try {

			int i = 10 / 0;

			System.out.println(i);
			
			System.out.println("Hi this exception Demo");


		} catch (ArithmeticException e) {

			System.out.println("divide by zero");

			e.printStackTrace();
			
		} finally {

			System.out.println("finally blcok is excuted");

		}

	}
}
