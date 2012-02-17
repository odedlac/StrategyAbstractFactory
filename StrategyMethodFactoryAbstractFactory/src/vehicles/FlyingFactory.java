/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class FlyingFactory {

	public Flying createFlying(String string) {
		if(string.equals("Fighter Jet")){
			return new IFlyLikeFJ();
		} else if (string.equals("Model Airplane")){
			return new IDontFly();
		} else if (string.equals("Passenger Airplane")){
			return new IFlyLikePP();
		} else {
			return null;
		}
	}

}
