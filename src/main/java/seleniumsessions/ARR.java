package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ARR {

	public static void main(String[] args) {

		int p[] = {1,4,5,2,3,22,31, 2};
		
		int q[] = new int[p.length-1];
		
		int count=0;
		for(int e : p) {
			if(!(e==22)) {
				q[count] = e;
				count++;
			}
		}
		System.out.println(Arrays.toString(q));
		
		int ss[] = Arrays.copyOf(p, p.length);
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		
		int nn[] = Arrays.copyOfRange(p, 0, 3);
		System.out.println(Arrays.toString(nn));
		
		Arrays.fill(p, 100);
		System.out.println(Arrays.toString(p));
		
		int test[][] = {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000},
		};
		
		System.out.println(test.length);
		System.out.println(test[0].length);
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[0].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---");
		for(int e[] : test) {
			for(int d : e) {
				System.out.print(d+ " ");
			}
			System.out.println();
		}
		
		//
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		
		ar1.addAll(ar);		
		System.out.println(ar1);	



	}

}
