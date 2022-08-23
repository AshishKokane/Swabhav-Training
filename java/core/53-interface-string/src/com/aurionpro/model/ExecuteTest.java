package com.aurionpro.model;

import com.aurionpro.test.ConsoleColors;
import com.aurionpro.test.Executable;
import com.aurionpro.test.Iexecutable;

public class ExecuteTest {

	public static void main(String[] args) {

		Executable exe = new Executable();
		exe.execute("Executing task........");

		Iexecutable ex = new Iexecutable() {
			@Override
			public void execute(String msg) {
				System.out.println(msg);

			}
		};
		ex.execute("Execution done..........");

		Iexecutable ex1 = (msg) -> { // lambda can only be implemented in case of functional inerface
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "executing lambda    " + msg + ConsoleColors.RESET);
		};

		ex1.execute("heee"); // static reference

		Iexecutable exee = ExecuteTest::showMessage;
		exee.execute("hello");

	}

	public static void showMessage(String msg) {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Show message called  " + msg + ConsoleColors.RESET);
	}

}
