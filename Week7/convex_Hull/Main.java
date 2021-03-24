package convex_Hull;
import java.util.*;

import java.util.Random;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Main {
	
	public static void main(String[] args) {
		//creating class type array
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many coordinate do you want to insert: ");
		int maxCoordinate = sc.nextInt();
		
	
		
		coordinate point[] = new coordinate[maxCoordinate];
		
		Random rand = new Random();
		
		for( int i=0;i<maxCoordinate; i++) {
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			
			point[i] = new coordinate(x,y);
		}
		
		
//		point[0]= new coordinate(5,5);
//		point[1]= new coordinate(4,3);
//		point[2]= new coordinate(2,1);
//		point[3]= new coordinate(3,2);
//		point[4]= new coordinate(0,3);
//		point[5]= new coordinate(3,4);
//		point[6]= new coordinate(0,0);
//		point[0]= new coordinate(5,5);
		
		JarvisMarchAlgo gfw = new JarvisMarchAlgo();
		gfw.convexhall(point);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time::" +(endTime-startTime)+ " ms");
	}

}
