package com.exceptionprograme;

public class Demo3 {

	public static void main(String[] args) {

		try {
			int i = 10 / 0;

			System.out.println(" divide by zero  statement is not excuted if exception found in try blk");

		} catch (ArithmeticException e) {

			System.out.println("divide by zero this statement is not excuetd because try in blcok exception found");

			e.printStackTrace();
		} finally {
			System.out.println("finally blcok");
		}

	}

}
