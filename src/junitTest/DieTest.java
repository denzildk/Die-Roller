package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dice.Die;

class DieTest {

	@Test
	void test() {

		Die die = new Die();
		
		for (int i = 0; i < 1000; i++) {

			die.roll();
			System.out.println(die.getFace());

			assertTrue(die.getFace() >= 1 && die.getFace() <= 6);
		}
	}
}
