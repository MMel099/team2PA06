import java.util.*;


public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? ");
		String filename = input.next();
		System.out.println("How many clusters? ");
		int clusters = input.nextInt();
		Sample cluster = new Cluster(fileReader(file));
	}





	public double[] fileReader(file){
      	Scanner reader = new Scanner(file);
      	ArrayList<Double> values;
      	while (reader.hasNextLine()) {
  			values.add(reader.nextDouble()); // Read the next two integers. Increment count after this operation.
		}
		return values;
    }

}