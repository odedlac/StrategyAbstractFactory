/**
 * 
 */
package vehicles;

/**
 * @author oded
 *
 */
public class LiftOffFactory {

	public LiftOff createLiftOff(String string) {
		if(string.equals("Horizontally")){
			return new ILiftOffH();
		} else if (string.equals("don't")){
			return new IDontLiftOff();
		} else if (string.equals("Vertically")){
			return new ILiftOffV();
		} else {
			return null;
		}
	}

}
