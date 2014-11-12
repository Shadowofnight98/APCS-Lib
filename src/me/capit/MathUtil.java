package me.capit;

public class MathUtil {
	
	/**
	 * Rounds the double <i>num</i> to the nearest multiple of <i>mult</i>.<br><br>
	 * Examples:<br>
	 *     2.4,1.0 > 2.0<br>
	 *     2.4,3.0 > 3.0<br>
	 *     4.5,3.0 > 6.0
	 * @param num The number to round.
	 * @param mult The multiple to compare to.
	 * @return The rounded number.
	 */
	public static double roundToNearest(double num, double mult){
		return Math.round(num/mult)*mult;
	}
	
	/**
	 * Works similarly to {@link #roundToNearest(double, double) roundToNearest} method except that the 
	 * number is floored and not rounded.
	 * @param num The number to round.
	 * @param mult The multiple to compare to.
	 * @return The floored number.
	 */
	public static double floorToNearest(double num, double mult){
		return Math.floor(num/mult)*mult;
	}
	
	/**
	 * Works similarly to {@link #roundToNearest(double, double) roundToNearest} method except that the 
	 * number is ceilinged and not rounded.
	 * @param num The number to round.
	 * @param mult The multiple to compare to.
	 * @return The ceilinged number.
	 */
	public static double ceilToNearest(double num, double mult){
		return Math.ceil(num/mult)*mult;
	}
	
	
	
}
