package orj.jnit.simpleJava;

public class AverageArray {
	//@SuppressWarnings("unused")
	public static void main(String args[]) {
		int num[] = new int[100];
		int total;
		int avg;
		int diff;
		total = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (1 + Math.round((99.0 * Math.random())));
			total += num[i];
		}
		System.out.println(Math.random());
		avg=total/num.length;
		System.out.println("number difference");
		for(int i=0; i<num.length; i++){
			diff= num[i]-avg;
			System.out.println(" "+num[i]+" "+diff+"\n");
		}
		System.out.println("average is: "+avg);
		
	}

}
