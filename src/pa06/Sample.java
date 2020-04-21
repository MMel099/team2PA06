package pa06;

import java.util.*;

/**
 * A Sample represents a vector of doubles to be used in a clustering algorithm...
 * @author presenting
 *
 */

public class Sample {
	ArrayList<Double> sample;

	public Sample(double[] values) {
		this.sample = new ArrayList<Double>();
		for (int i=0; i<values.length; i++) {
			sample.add(values[i]);
		}

	}

	public static void main(String[] args) {
		System.out.println("testing for the Sample class.");
		double[] p1 = {1d, 2d, 3.14, 2.712};
		double randp1 = randomElement(p1);
		double[] p2 = {0.1, 1.1, 2.1, 3.1};
		double randp2 = randomElement(p1);
		Sample s1 = new Sample(p1);
		Sample s2 = new Sample(p2);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

	}

	public double randomElement (double[] p) {
		Random random = new Random();
		int randInt = random.nextInt(4);
		return p[randInt];
	}

}
