package orj.jnit.arrayStack;

public class PushAndTest {
	public boolean overflow;
	public int value;

	PushAndTest(boolean o) {
		overflow = o;
		System.out.println(o);
	}
	
	PushAndTest(boolean o, int v){
		overflow = o;
		value = v;
		System.out.println(o +" "+ v);
	}

}
