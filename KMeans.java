import java.util.*;

public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? ");
		String filename = input.next();
		System.out.println("How many clusters? ");
		int clusters = input.nextInt();
		Sample originalCluster = new Sample(fileReader(filename));
	}

	public double[] fileReader(String file){
      	Scanner reader = new Scanner(file);
      	int count = 0;
      	ArrayList nums = new ArrayList<Doubles>();
      	while (reader.hasNextLine()) {
  			nums.add(reader.next());
		}
		return nums;
    }

}