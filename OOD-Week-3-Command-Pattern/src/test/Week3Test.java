package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week3.Instructor;
import week3.Worker;

class Week3Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUp() throws Exception {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void test() throws IOException {
		Worker worker = new Worker("John");     // Receiver
		Instructor instructor = new Instructor();  // Invoker
		
		instructor.instructEnter(worker);         // Binding and Execution
		assertEquals("John entered in the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructLeave(worker);
		assertEquals("John left the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// put John inside the lawnmower again by undoing last operation
		instructor.instructUndo(worker);
		assertEquals("John entered in the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructStart(worker);
		assertEquals("John started the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructStop(worker);
		assertEquals("John stopped the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// make John starting the lawnmower again by undoing last operation
		instructor.instructUndo(worker);
		assertEquals("John started the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// make John stopping the lawnmower by redoing last undone operation 
		instructor.instructRedo(worker);
		assertEquals("John stopped the lawnmower." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
	}

}
