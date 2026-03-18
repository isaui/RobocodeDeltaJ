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
		if (bot.enemy != null) {
			double absoluteBearing = bot.getHeadingRadians() + bot.enemy.bearingRadians;
			bot.setTurnGunRightRadians(
					robocode.util.Utils.normalRelativeAngle(absoluteBearing - bot.getGunHeadingRadians()));
		}
	}

}
