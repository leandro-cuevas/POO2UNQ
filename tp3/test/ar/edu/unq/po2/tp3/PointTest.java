package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void test() {
		Point punto1 = new Point(1, 2);
		Point punto2 = new Point(2, 1);
		Point punto3 = Point.pointSum(punto1, punto2);
		assertEquals(punto3.getX(), 3);
		assertEquals(punto3.getY(), 3);
		Point.move(punto3, 4, 4);
		assertEquals(punto3.getX(), 4);
		assertEquals(punto3.getY(), 4);

	}

}
