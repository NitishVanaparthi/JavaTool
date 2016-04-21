package orj.jnit.arrayStack;

public class PopAndTest {
	public boolean underflow;
	public int value;

	PopAndTest(boolean u) {
		underflow = u;
		System.out.println(u);
	}
	
	PopAndTest(boolean u, int v){
		underflow = u;
		value = v;
		System.out.println(u +" "+ v);
	}

}
