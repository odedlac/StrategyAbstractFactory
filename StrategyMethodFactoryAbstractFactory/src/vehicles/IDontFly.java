/**
 * 
 */
package vehicles;


/**
 * @author oded
 *
 */
public class IDontFly implements Flying {

	/* (non-Javadoc)
	 * @see vehicles.Flying#howIFly()
	 */
	@Override
	public String howIFly() {
		return "I don't Fly";
	}

}
