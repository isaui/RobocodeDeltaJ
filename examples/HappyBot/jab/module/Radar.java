package jab.module;

/**
 * Radar
 * 
 * @author jab
 */
public class Radar extends Part {

	public Module bot;

	public Radar(Module bot) {
		this.bot = bot;
	}

	public void scan() {
		double angle = robocode.util.Utils.normalAbsoluteAngle(Math.atan2(aimX - bot.getX(), aimY - bot.getY()));
		bot.setTurnRadarRightRadians(robocode.util.Utils.normalRelativeAngle(angle - bot.getRadarHeadingRadians()));
	}

}
