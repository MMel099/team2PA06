import java.util.*;

public class Cluster{
	Point[] list;
	Point centroid;
	File file;

	public Cluster(String filename) throws FileNotFoundException{
		file = new File(filename);

	}

	public void fileReader(){
      Scanner reader = new Scanner(file);
      int count = 0;
      while (reader.hasNextLine()) {
        list[count].x = reader.nextInt();
        String y = reader.nextInt();
      }
  }
}