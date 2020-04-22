import java.util.*;
NUMCLUSTERS = 15;


public class KMeans{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file name? (ends in .txt)");
		String filename = input.next();
		Cluster originalData = new Cluster(filename)
		Point[] clusterPoints = new Point[NUMCLUSTERS];
		Cluster[] clusters = Cluster[15];
		for (int i = 0; i < clustersPoints.length; i++){
			Point clusterPoint = originalData.randomElement
			clusterPoints[i] = clusterPoint;
			cluster[i] = new Cluster(clusterPoint);
		}
	}
	public static int findClosest(Point a, Point[] clusters){
		int closestIndex = -1;
		int closestDistance = -1;
		for (int i = 0; i < clusters.length; i++){
			int distance = Math.sqrt(Math.pow(clusters[i].x - a.x,2) + Math.pow(clusters[i].y - a.y,2));
			if (distance < closestDistance || closestDistance == -1){
				closestDistance	= distance;
				closestIndex = i;
			}
		}
		return i;
	}

}
