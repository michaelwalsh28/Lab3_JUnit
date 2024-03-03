import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester 
{
	GradeBook grade1, grade2;

	@BeforeEach
	void setUp() throws Exception 
	{
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(95);
		grade1.addScore(85);
		grade1.addScore(78);
		grade1.addScore(60);
		grade1.addScore(45);
		
		grade2.addScore(60);
		grade2.addScore(78);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testAddScore() 
	{
		assertTrue(grade1.toString().equals("95.0 85.0 78.0 60.0 45.0 "));
		assertTrue(grade2.toString().equals("60.0 78.0 0.0 0.0 0.0 "));
	}

	@Test
	void testSum()
	{
		assertEquals(363, grade1.sum(), 0.0001);
		assertEquals(138, grade2.sum(), 0.0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(45, grade1.minimum(), 0.001);
		assertEquals(60, grade2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(318, grade1.finalScore(), 0.0001);
		assertEquals(78, grade2.finalScore(), 0.0001);
	}

}
