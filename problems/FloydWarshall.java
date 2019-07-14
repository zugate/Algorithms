package problems;

import java.util.Scanner;

public class FloydWarshall {
	
	int[][] floydWarshall(int graph[][],int v){
		
		int[][] dist=new int[v][v];
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				dist[i][j]=graph[i][j];
			}
		}
		
		for(int k=0;k<v;k++) {
			for(int i=0;i<v;i++) {
				for(int j=0;j<v;j++) {
					if(dist[i][j]>dist[i][k]+dist[i][k])
						dist[i][j]=dist[i][k]+dist[k][j];
				}
			}
		}
		return dist;
	}
	public static void main(String...asd) {
		
	
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int[][] graph = new int[v][v];
		int[][] result = new int[v][v];
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				graph[i][j]=sc.nextInt();
			}
		}
 		FloydWarshall fis=new FloydWarshall();
 		result=fis.floydWarshall(graph,v);
 		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
