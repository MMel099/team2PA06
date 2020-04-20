import java.util.*;

public class Sample{
	double x = 0;
	double y = 0;

	public Sample(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double distance(Sample a, Sample b){
		return Math.sqrt(Math.pow(b.x - a.x,2) + Math.pow(b.y - a.y,2));
	}


}
