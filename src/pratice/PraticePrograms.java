package pratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PraticePrograms {
	
	public static void prime() {
		
		for (int i=1;i<=10;i++) {
			int count =0;
			
			for (int j=i;j>=1;j--) {
				if (i%j==0) {
					count = count +1;
				}
			}
			
			if (count ==2) {
				
				System.out.println(i + " PrimeNumber");
				
			}else {
				System.out.println(i + " NotPrimeNumber");
			}
			
		}
		
		
	}

	public static void armStrong() {
		
		int value =0;
		int number = 153;
		while(number>0) {
			int mod = number%10;
			number = number/10;
			value = (mod*mod*mod)+value;
			System.out.println(value);
			
		}
	}
	
	public static void pramid() {
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public static void addmap() {
		
		Map<Integer, String> demo = new Hashtable<Integer, String>();
		demo.put(01, "hp");
		demo.put(02, "dell");
		demo.put(03, "lenova");
		
		for (Map.Entry<Integer, String> val : demo.entrySet()) {
			
			System.out.println(val.getKey()+" "+val.getValue());
			
		}
		
		
	}
	
	
	public static void duplicate() {
		int [] arr = {10,20,10,25,20};
		
		Set<Integer> dup = new HashSet<Integer>();
		
		for (Integer num : arr) {
			
			if (!dup.contains(num)) {
				
				
				System.out.println(dup.add(num));
				Integer value = num.valueOf(num);
				System.out.println(value);
				
			}else {
				
			}
				
			
		}
	}
	
	public static void main(String[] args) {
		//prime();
		//armStrong();
		//pramid();
		//addmap();
		duplicate();
	}
	
}
