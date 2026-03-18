package jab.module;

/**
 * Targeting
 * 
 * @author jabier.martinez
 */
public class Targeting extends Part {

	public Module bot;

	public Targeting(Module bot) {
		this.bot = bot;
	}

	public void target() {
		double angle = robocode.util.Utils.normalAbsoluteAngle(Math.atan2(aimX - bot.getX(), aimY - bot.getY()));
		bot.setTurnGunRightRadians(robocode.util.Utils.normalRelativeAngle(angle - bot.getGunHeadingRadians()));
	}

}
