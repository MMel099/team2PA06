import java.util.*;


public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? (ends in .txt)");
		String filename = input.next();
		Cluster originalData = new Cluster(filename);
		Cluster[] clusters = Cluster[15];
		for (int i = 0; i < clusters.length; i++){
			clusters[i] = new Cluster(originalData.randomElement);
		}
		for (int j = 0; j < originalData.length; j++){
			clusters[findClosest(originalData[j], clusters)].clusteredData.add(originalData[j]);
		}
		for (int k = 0; k < 100; k++){
			replaceClusters(clusters);	
		}
	}
	public static int findClosest(Point a, Cluster[] clusters){
		int closestIndex = -1;
		int closestDistance = -1;
		for (int i = 0; i < clusters.length; i++){
			int distance = Math.sqrt(Math.pow(clusters[i].centroid.x - a.x,2) + Math.pow(clusters[i].centroid.y - a.y,2));
			if (distance < closestDistance || closestDistance == -1){
				closestDistance	= distance;
				closestIndex = i;
			}
		}
		return closestIndex;
	}
	public static void replaceClusters(Cluster[] clusters){
		for (int i = 0; i < clusters.length; i++){
			Point centroid = clusters[i].findAverage();
			clusters[i] = new Cluster(centroid);
			for (int j = 0; j < originalData.length; j++){
				cluster[findClosest(originalData[j], clusters)].clusteredData.add(originalData[j]);
			}
			System.out.println("New Cluster " + (i + 1) + " has centroid " + clusters[i].centroid.toString() + " and " + clusters[i].length + " points.");
		}
	}
}
