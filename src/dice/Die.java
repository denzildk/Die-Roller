package dice;

import java.util.Random;

public class Die {
	
	Random rand = new Random();
	private int sides;
	private int face;
	
	public Die() {
		this(6);
	}
	
	public Die(int sides) {
		//System.out.println("setting sides to: "+sides);
		this.sides = sides;
		roll();
	}
	
	public void roll() {
		//System.out.println("rolling for " + sides + "sides");
		face = rand.nextInt(sides)+1;
		//System.out.println("result of rolling: "+face);
	}
	
	public int getFace() {
		return face;
	}
}
