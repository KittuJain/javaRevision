import org.junit.Test;
import static org.junit.Assert.*;

public class RevisionTest{
	@Test
	public void fibonacci_of_5_gives_3() {
		Revision r = new Revision();
		assertEquals(3,r.fibonacci(5));
	}

	@Test
	public void factorial_of_1_is_1() {
		Revision r = new Revision();
		assertEquals(1,r.factorial(1));
	}
	
	@Test
	public void factorial_of_5_is_120() {
		Revision r = new Revision();
		assertEquals(120,r.factorial(5));
	}
}