package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Shape;
import org.junit.Test;

public class CuboidTest {
	
	Cuboid cube1 = new Cuboid(1 ,1, 1);
	Shape cube2;

	@Test
	public void test() {
		cube2 = new Cuboid(1 ,1, -1);
		
		assertTrue(cube1 instanceof Cuboid);
	}
	
	@Test
	public void testGetWidth() {
		cube1 = new Cuboid(1 ,1, 1);
		assertEquals(1.0, cube1.getWidth(), 0.0);
	}

}
