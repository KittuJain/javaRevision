import org.junit.Test;
import static org.junit.Assert.*;

public class RevisionTest{
	@Test
	public void fibonacci_of_5_gives_3 () {
		Revision r = new Revision();
		assertEquals(3,r.fibonacci(5));
	}

	@Test
	public void factorial_of_1_is_1 () {
		Revision r = new Revision();
		assertEquals(1,r.factorial(1));
	}

	@Test
	public void factorial_of_5_is_120 () {
		Revision r = new Revision();
		assertEquals(120,r.factorial(5));
	}

	@Test
	public void add_1_increments_allItems_by_1 (){
		Revision r = new Revision();
		int[] x = {9,8,42,31,12};
		int[] y = {10,9,43,32,13};
		r.add(x,1);
		for (int i = 0; i < x.length; i++) {
			assertEquals(x[i] ,y[i]);
		}
	}

	@Test
	public void add_5_increments_allItems_by_5 (){
		Revision r = new Revision();
		int[] x = {9,8,42,31,12};
		int[] y = {14,13,47,36,17};
		r.add(x,5);
		for (int i = 0; i < x.length; i++) {
			assertEquals(x[i] ,y[i]);
		}
	}

	@Test
	public void readBinary_reads_numbers_as_binary () {
		Revision r = new Revision();
		assertEquals(0,r.readBinary(0));
		assertEquals(1,r.readBinary(1));
		assertEquals(2,r.readBinary(10));
		assertEquals(9,r.readBinary(1001));
		assertEquals(255,r.readBinary(11111111));
	}
}