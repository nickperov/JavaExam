package com.nickperov.study.ocp_1Z0_809.ch2_DesignPatterns.polymorphism;

public class Whale implements LivesInOcean {

	@Override
	public void makeSound() {
		System.out.println("sing");
	}
}