import java.util.*;

public class Point{
	double x = 0;
	double y = 0;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
        return "(" + this.x + ", "  + this.y + ")";
    }
}
