package lab1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
	
	TriangleProblem tp = new TriangleProblem();
	
	@Test
	public void testJunit1() {
		assertEquals("Scalene Triangle" , tp.isTriangle(3, 4, 5));
	}
	
	@Test
	public void testJunit2() {
		assertEquals("Isosceles Triangle" , tp.isTriangle(3, 3, 5));
	}
	
	@Test
	public void testJunit3() {
		assertEquals("Equilateral Triangle" , tp.isTriangle(3, 3, 3));
	}

}
