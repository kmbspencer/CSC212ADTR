package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}
	/**
	 * makes a new map that maps two letters together
	 * @return MAPADT<String, String>
	 */
	public MapADT<String,String> helper(){
		MapADT<String, String> helper = new JavaMap<>();
		helper.put("a", "b");
		helper.put("c","d");
		helper.put("e","f");
		return helper;
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		
	}
	@Test
	public void testPut() {
		MapADT<String, String> testPut = new JavaMap<>();
		testPut.put("a", "b");
		testPut.put("c","d");
		assertEquals(testPut.size(),2);
		assertEquals(testPut.get("a"),"b");
		assertEquals(testPut.get("c"),"d");
	}
	@Test
	public void testGet() {
		MapADT<String, String> testGet = helper();
		assertEquals(testGet.size(),3);
		assertEquals(testGet.get("a"),"b");
		assertEquals(testGet.get("c"),"d");
		assertEquals(testGet.get("e"),"f");
	}
	@Test
	public void testSize() {
		MapADT<String, String> testSize = helper();
		assertEquals(testSize.size(),3);
		testSize.put("g","h");
		assertEquals(testSize.size(),4);
		testSize.put("i","j");
		assertEquals(testSize.size(),5);
		assertTrue(testSize.size()!=8);
	}
	@Test
	public void testRemove() {
		MapADT<String, String> testRemove = helper();
		testRemove.remove("a");
		assertEquals(testRemove.size(),2);
		assertNull(testRemove.get("a"));
		
	}
	
}
