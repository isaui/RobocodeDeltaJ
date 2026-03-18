package jab.module;

/**
 * Movement
 * 
 * @author jab
 */
public class Movement extends Part {

	public Module bot;

	public Movement(Module bot) {
		this.bot = bot;
	}

	public void move() {
		double randomDistance = (Math.random() * 100) - 50;

		double randomAngle = (Math.random() * 90) - 45;

		bot.setAhead(randomDistance);
		bot.setTurnRight(randomAngle);
	}

}
