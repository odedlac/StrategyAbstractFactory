/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class HarrierFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory();
		return flyingFactory.createFlying("Fighter Jet");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Vertically");
	}

}
