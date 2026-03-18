package jab.module;

/**
 * Gun
 * 
 * @author jab
 */
public class Gun extends Part {

	public Module bot;

	public Gun(Module bot) {
		this.bot = bot;
	}

	public void fire() {
		if (bot.bulletPower > 0 && bot.getGunHeat() == 0) {
			robocode.Bullet b = bot.setFireBullet(bot.bulletPower);
			bot.registerBullet(b);
		}
	}

}
