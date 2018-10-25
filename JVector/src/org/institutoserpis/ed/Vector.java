package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[] {16, 12, 15, 14, 17};
		
		for (int index = 0; index < 5; index++)
			System.out.println( v[index]);
		
		int index0fX = index0f(v, 12);
		System.out.println("index="+index0fX);
	}

	
	public static int index0f(int[] v, int x) {
//		int index = 0;
//		while (index < v.length && v[index] != x)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		for (int index = 0; index < v.length; index++)
			if (v[index] == x)
				return index;
		return -1;
	}
	
	public static int min(int[] v) {
		return -33; //TODO implementar
	}
}
