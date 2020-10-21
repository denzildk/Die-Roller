package junitTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import dice.Die;

class ReliablyRandom {

	@Test
	void test() {
		
		int sides=(int)(Math.random()*100)+1;
		Die die = new Die(sides);
		int[] results = new int[sides];
		int rolls = 1000;
		double errAllowed = 0.1;
		
		System.out.println("testing for "+sides+" sides");
		
		for (int i = 0; i < rolls; i++) {
			die.roll();
			results[die.getFace()-1]++;
			
		}
		
		System.out.println("Die rolled "+rolls+" times, getting the results: ");
		for (int i = 0; i < results.length; i++) {
			System.out.println(i+1+" rolled "+results[i]+" times");
		}
		
		int variance = 0;
		
		for (int i = 0; i < results.length; i++) {
			variance += Math.abs(results[i]-(rolls/sides));
			System.out.println("variance for "+(i+1)+": "+Math.abs(results[i]-(rolls/sides)));
		}
		System.out.println("variance: "+variance+". Max allowed variance: "+rolls*errAllowed);
		assertTrue(rolls*errAllowed>variance);
	}

}
