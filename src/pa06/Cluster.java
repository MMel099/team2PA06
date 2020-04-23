import java.util.*;
import java.io.*;
//this is the cluster class that stores an Arraylist of points and a centroid point
public class Cluster{
	ArrayList<Point> originalData = new ArrayList<Point>();
	ArrayList<Point> clusteredData;
	Point centroid;

	public Cluster(String filename) throws IOException{//this constructor is for the initial call, when data has to be read from a file
		ArrayList<Point> values = new ArrayList<Point>();
		fileReader(filename);
		this.centroid = new Point(0, 0);
	}
	public Cluster(Point clusterPoint){//this constructor is for future calls when the data is being reclustered
		centroid = clusterPoint;
		clusteredData = new ArrayList<Point>();
	}
	public void fileReader(String file) throws IOException {//this method reads a file whose name was passed in as a parameter
      	Scanner reader = new Scanner(file);
      	while (reader.hasNextLine()) {
					Point p = new Point(reader.nextInt(),reader.nextInt());
  				originalData.add(p);//this line reads both integer in the line and stores then as coordinates for a point
				}
    }
    public Point randomElement(){//this method finds a random index in an ArrayList and returns that element of the ArrayList
        Random random = new Random();
        int randInt = random.nextInt(originalData.size());
        return originalData.get(randInt);
    }
    public Point findAverage(){//this method finds the average point in a cluster
    	int sumX = 0;
    	int sumY = 0;
    	for (int i = 0; i < clusteredData.size(); i++){//traverses through cluster points
    		sumX += clusteredData.get(i).x;//adds all x values
    		sumY += clusteredData.get(i).y;//adds all y values
    	}
    	Point average = new Point(sumX/clusteredData.size(), sumY/clusteredData.size());//creates a new average point
    	return average;
    }

 }
 /*int x = 0;
    int xFinal = 0;
    int y = 0;
    int yFinal = 0;
    if (/current character/ != " "){
      for (int i=0; i<6; i++){
        x = (/current character of the line/) * Math.pow(10, 5-i);
        xFinal += x;
      }
      break;
    }
    if (/current character/ != " "){
      for (int i=0; i<6; i++){
        y = (/current character of the line/) * Math.pow(10, 5-i);
        yFinal += y;
      }
    }
*/
