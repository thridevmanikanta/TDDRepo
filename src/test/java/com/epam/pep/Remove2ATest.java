package com.epam.pep;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2ATest {
	Remove2A remove2a;
	@BeforeEach
	public void createObj()
	{
		remove2a = new Remove2A();
	}
	@Test
	public void SingleA() {
		assertEquals("BCD",remove2a.remove("ABCD"));
	}
	@Test
	public void DoubleA() {
		assertEquals("CD",remove2a.remove("AACD"));
	}
	@Test
	public void SecondA() {
		assertEquals("BCD",remove2a.remove("BACD"));
	}
	@Test
	public void NoA() {
		assertEquals("BBAA",remove2a.remove("BBAA"));
	}
	@Test
	public void AnyLength() {
		assertEquals("BAA",remove2a.remove("AABAA"));
	}
	@Test
	public void OnlyA() {
		assertEquals("",remove2a.remove("A"));
	}
	@Test
	public void Only2A() {
		assertEquals("",remove2a.remove("AA"));
	}
	@Test
	public void Null() {
		assertEquals("",remove2a.remove(""));
	}
}
