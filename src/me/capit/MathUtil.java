package me.capit;

import java.util.ArrayList;
import java.util.List;

/**
 * APCSLib Math Utility class. Holds several methods for math operations.
 * @author Capit Software
 *
 */
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
	
	/**
	 * Gets the lowest common multiple between <i>x</i> and <i>y</i>.
	 * @param x The first integer.
	 * @param y The second integer.
	 * @return The lowest common multiple.
	 */
	public static long getLCM(long a, long b){
		return a * (b / getGCF(a, b));
	}
	
	/**
	 * Works like {@link #getLCM(long, long) getLCM} but allows for more inputs.
	 * @param input The array of longs as input.
	 * @return The lowest common multiple.
	 */
	public static long getLCM(long[] input){
		long result = input[0];
		for(int i = 1; i < input.length; i++) result = getLCM(result, input[i]);
		return result;
	}
	
	/**
	 * Gets the greatest common factor (denominator) of the two numbers.
	 * @param x The first number.
	 * @param y	The second number.
	 * @return The greatest common multiple.
	 */
	public static long getGCF(long x, long y){
		while (y>0){
			long tmp = y;
			y=x%y;
			x = tmp;
		}
		return x;
	}
	
	/**
	 * Works like {@link #getGCF(long, long) getGCF} but allows for more inputs.
	 * @param input The array of longs as input.
	 * @return The greatest common factor (denominator).
	 */
	public static long getGCF(long[] input){
		long result = input[0];
	    for(int i = 1; i < input.length; i++) result = getGCF(result, input[i]);
	    return result;
	}
	
	/**
	 * Gets all integral factors of a number.
	 * @param num The number.
	 * @return An array of factors.
	 */
	public static int[] getFactors(int num){
		List<Integer> ints = new ArrayList<Integer>();
		for (int i=0; i<=num; i++){
			if (num%i==0) ints.add(i);
		}
		return integerListToArray(ints);
	}
	
	/**
	 * Converts an {@link List}&lt;{@link Integer}&gt; to an <i>int</i> array.
	 * @param list The List to convert.
	 * @return The <i>int</i> array.
	 */
	public static int[] integerListToArray(List<Integer> list){
		int[] ret = new int[list.size()];
	    for (int i=0; i < ret.length; i++){
	        ret[i] = list.get(i).intValue();
	    }
	    return ret;
	}
	
	/**
	 * Converts a {@link List}&lt;{@link Double}&gt; to a <i>double</i> array.
	 * @param list The List to convert.
	 * @return The <i>double</i> array.
	 */
	public static double[] doubleListToArray(List<Double> list){
		double[] ret = new double[list.size()];
	    for (int i=0; i < ret.length; i++){
	        ret[i] = list.get(i).intValue();
	    }
	    return ret;
	}
	
	/**
	 * Gets the average of the <i>long</i> array;
	 * @param input The array.
	 * @return The average.
	 */
	public static long getAverage(long[] input){
		long sum=0;
		for (long num : input){sum+=num;}
		return sum/input.length;
	}
}
