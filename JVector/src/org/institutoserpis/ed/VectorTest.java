package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void index0f() {
		int[] v = new int[] {16,12,15,14,17};
		assertEquals(0, Vector.index0f(v, 16));
		assertEquals(2, Vector.index0f(v, 15));
		assertEquals(4, Vector.index0f(v, 17));
		assertEquals(-1, Vector.index0f(v, 33));
	}
	
	@Test
	void index0fEmpty() {
		int[] v = new int[] {};
		assertEquals(-1,Vector.index0f(v, 22));
	}
	
	@Test
	void min() {
		assertEquals(12, Vector.min(new int[] {16, 12, 15, 14, 17}));
		
	}

}
