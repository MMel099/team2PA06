import java.util.*;

//this is the KMeans class and it is responsible for the bulk of the clustering algorithm
public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? (ends in .txt)");//asks user for a file name
		String filename = input.next();
		Cluster cluster = new Cluster(filename);
		Point[] originalData = new Point[5000];//inital call for the Point constructor with String filename parameter
		Cluster[] clusters = new Cluster[15];
		for (int i = 0; i < clusters.length; i++){
			clusters.centroid[i] = new Cluster(cluster.randomElement());//subsequent calls for clusters with centroid point parameter
		}
		for (int j = 0; j < originalData.length; j++){
			clusters[findClosest(originalData[j], clusters)].clusteredData.add(originalData[j]);//traverses original data and sorts the points into closest clusters
		}
		for (int k = 0; k < 100; k++){//clustering repeated 100
			replaceClusters(clusters);
		}
	}
	public static int findClosest(Point a, Cluster[] clusters){//this method finds the closest cluster point to a specific data point
		int closestIndex = -1;
		int closestDistance = -1;
		for (int i = 0; i < clusters.length; i++){
			int distance = Math.sqrt(Math.pow(clusters[i].centroid.x - a.x,2) + Math.pow(clusters[i].centroid.y - a.y,2));
			if (distance < closestDistance || closestDistance == -1){
				closestDistance	= distance;
				closestIndex = i;
			}
		}
		return closestIndex;//index of closest cluster returned
	}
	public static void replaceClusters(Cluster[] clusters){//this method finds the average of a cluster and makes a new cluster with that centroid
		for (int i = 0; i < clusters.length; i++){//traverses the array of clusters
			Point centroid = clusters[i].findAverage();
			clusters[i] = new Cluster(centroid);//constructs new cluster with calculated centroid point
			for (int j = 0; j < originalData.length; j++){//traverses original data and sorts the points into closest clusters
				cluster[findClosest(originalData[j], clusters)].clusteredData.add(originalData[j]);
			}
			System.out.println("New Cluster " + (i + 1) + " has centroid " + clusters[i].centroid.toString() + " and " + clusters[i].length + " points.");//prints the cluster
		}
	}
}
