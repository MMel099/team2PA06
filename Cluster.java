import java.util.*;

public class Cluster{
	ArrayList<Point> originalData;
	Point centroid;

	public Cluster(String filename) throws FileNotFoundException{
		values = new ArrayList<Point>;
		fileReader(filename);
	}
	public Cluster(Point clusterPoint){
		centroid = clusterPoint;
	}
	public void fileReader(file){
      	Scanner reader = new Scanner(file);
      	while (reader.hasNextLine()) {
  			originalData.add(Point(reader.nextInt(),reader.nextInt())); // Read the next two integers. Increment count after this operation.
		}
    }
    public Point randomElement () {
        Random random = new Random();
        int randInt = random.nextInt(originalData.length);
        return originalData[randInt];
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