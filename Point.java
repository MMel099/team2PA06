import java.util.*;
//this is the Point class that is used to store coordinates
public class Point{
	double x = 0;
	double y = 0;

	public Point(double x, double y){//constructs a point with coordinates (x,y)
		this.x = x;
		this.y = y;
	}
	public String toString() {//prints the point
        return "(" + this.x + ", "  + this.y + ")";
    }
}
