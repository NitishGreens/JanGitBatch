package org.test;

public class Employee {

	private void add() {
		System.out.println("add");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.add();
	}

	public void mul() {
		System.out.println("mul");
	}
}
