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
		bot.setAhead(moveAmount * moveDirection);
		moveAmount = Math.max(0, moveAmount - 1);
		bot.setTurnRight(45 * turnDirection);
	}

}
