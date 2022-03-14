package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MysfitTest {

	static Mysfit obj = new Mysfit();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj.setMysfitId("1");
		obj.setName("Argos");
		obj.setDescription("This is a Mythical Mysfit");
	}
	
	@Test
	void getName() {
		String output = "Argos";
		assertEquals("Argos", output);
	}
	
	@Test
	void setName() {
		String output = obj.getName();
		assertEquals("Portos", output);
	}


	@Test
	void testGetMysfitId() {
		String output = "1";
		assertEquals("1", output);
	}

	@Test
	void testSetMysfitId() {
		obj.setMysfitId("11");
		String output = obj.getMysfitId();
		assertEquals("10", output);
	}
	
	@Test
	void getDescription() {
		String output = "This is a Mythical Mysfit";
		assertEquals("This is a Mythical Mysfit", output);
	}
	
	@Test
	void setDescription() {
		String output = obj.getDescription();
		assertEquals("This is a Mythical Mysfit", output);
	}
	

}
