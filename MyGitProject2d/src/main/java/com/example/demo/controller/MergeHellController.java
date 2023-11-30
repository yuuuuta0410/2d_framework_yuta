package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	static void kadaiA() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i +"の何回目ループです。 ");
		}
	}
}