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
		if (bot.enemy != null) {
			double bulletPower;

			if (bot.enemy.distance > 500) {
				bulletPower = 1.0;
			} else if (bot.enemy.distance > 200) {
				bulletPower = 2.0;
			} else {
				bulletPower = 3.0;
			}

			bulletPower = Math.min(bulletPower, bot.getEnergy() - 0.01);
			bulletPower = Math.max(0, bulletPower);
			bot.bulletPower = bulletPower;

			if (bulletPower > 0 && bot.getGunHeat() == 0) {
				robocode.Bullet b = bot.setFireBullet(bulletPower);
				bot.registerBullet(b);
			}
		}
	}

}
