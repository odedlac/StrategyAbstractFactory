/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class HarrierFactory {

	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory();
		return flyingFactory.createFlying("Fighter Jet");
	}

	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Vertically");
	}

}
