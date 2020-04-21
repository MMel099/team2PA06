import java.util.*;


public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? ");
		String filename = input.next();
		System.out.println("How many clusters? ");
		int clusters = input.nextInt();
	}





	public void fileReader(){
      	Scanner reader = new Scanner(file);
      	int count = 0;
      	while (reader.hasNextLine()) {
  			list[count++] = new Point(reader.nextInt(), reader.nextInt()); // Read the next two integers. Increment count after this operation.
		}
    }

}