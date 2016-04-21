package orj.jnit.simpleJava;

public class TwoDArray {
	// Memory always stores the array data in straight forward because memory is
	// usually built linear
	public static void main(String args[]) {
		int a[][] = new int[3][5];
		/*
		 * the address of the specific element of arry is calculate using the
		 * formula base(a) + i1 * r2 + i2 * esize <--eg: for a[2][4]> base[a] +
		 * 2*5 + 4* 1 base(a) = 14
		 */
		//string in java are immutable
		//string buffer class are mutable
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int total = 1;
				total++;
				a[i][j] = total;
				// total++;
				System.out.println(a[i][j]);
			}
		}
	}

}