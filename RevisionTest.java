import org.junit.Test;
import static org.junit.Assert.*;

public class RevisionTest{
	@Test
	public void fibonacci_of_5_gives_120() {
		Revision r = new Revision();
		assertEquals(3,r.fibonacci(5));
	}
}