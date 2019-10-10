package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(0,empty.size());
	}
	/**
	 *  size
		insert
		contains
		remove
	 */
	@Test
	public void testSingle() {
		SetADT<String> single = new JavaSet<>();
		single.insert("A");
		assertEquals(1,single.size());
	}

	@Test
	public void testLonger() {
		SetADT<String> two = new JavaSet<>();
		two.insert("A");
		two.insert("B");
		assertEquals(2,two.size());
	}
	@Test
	public void testRepeatedInserts() {
		SetADT<String> repeats = new JavaSet<>();
		repeats.insert("A");
		repeats.insert("B");
		repeats.insert("C");
		for( int i = 0; i<20; i++) {
			repeats.insert("B");
		}
		assertEquals(3, repeats.size());
		assertEquals(true,repeats.contains("A"));
		assertEquals(true,repeats.contains("B"));
		assertEquals(true,repeats.contains("C"));
	}
	@Test
	public void testContains() {
		SetADT<String> contain = new JavaSet<>();
		contain.insert("A");
		contain.insert("B");
		contain.insert("C");
		assertEquals(true,contain.contains("A"));
		assertEquals(true,contain.contains("B"));
		assertEquals(true,contain.contains("C"));
	}
	@Test 
	public void testRemove() {
		SetADT<String> set1 = new JavaSet<>();
		set1.insert("A");
		set1.insert("B");
		set1.insert("C");
		set1.remove("A");
		assertEquals(false,set1.contains("A"));
		assertEquals(true,set1.contains("B"));
		assertEquals(true,set1.contains("C"));
	}
	
}
