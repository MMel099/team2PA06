import java.util.*;
import java.io.*;

//this is the KMeans class and it is responsible for the bulk of the clustering algorithm
public class KMeans{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("What is the file name? (ends in .txt)");//asks user for a file name
		String filename = input.next();
		Cluster cluster = new Cluster(filename);
		Point[] originalData = new Point[5000];//inital call for the Point constructor with String filename parameter
		Cluster[] clusters = new Cluster[15];
		for (int i = 0; i < clusters.length; i++){
			clusters[i] = new Cluster(cluster.randomElement());//subsequent calls for clusters with centroid point parameter
		}
		for (int j = 0; j < 5000; j++){
			clusters[findClosest(cluster.originalData.get(j), clusters)].clusteredData.add(cluster.originalData.get(j));//traverses original data and sorts the points into closest clusters
		}
		for (int k = 0; k < 100; k++){//clustering repeated 100
			replaceClusters(clusters, cluster);
		}
	}
	public static int findClosest(Point a, Cluster[] clusters){//this method finds the closest cluster point to a specific data point
		int closestIndex = -1;
		double closestDistance = -1;
		for (int i = 0; i < clusters.length; i++){
			double distance = Math.sqrt(Math.pow(clusters[i].centroid.x - a.x,2) + Math.pow(clusters[i].centroid.y - a.y,2));
			if (distance < closestDistance || closestDistance == -1){
				closestDistance	= distance;
				closestIndex = i;
			}
		}
		return closestIndex;//index of closest cluster returned
	}
	public static void replaceClusters(Cluster[] clusters, Cluster cluster){//this method finds the average of a cluster and makes a new cluster with that centroid
		for (int i = 0; i < clusters.length; i++){//traverses the array of clusters
			Point centroid = clusters[i].findAverage();
			clusters[i] = new Cluster(centroid);//constructs new cluster with calculated centroid point
			for (int j = 0; j < 5000; j++){//traverses original data and sorts the points into closest clusters
				cluster.originalData.get(findClosest(cluster.originalData.get(j), clusters));
				cluster.clusteredData.add(cluster.originalData.get(j));
			}
			System.out.println("New Cluster " + (i + 1) + " has centroid " + clusters[i].centroid.toString() + " and " + 15 + " points.");//prints the cluster
		}
	}
}
