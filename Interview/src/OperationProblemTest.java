import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OperationProblemTest {

	OperationProblem opblm = new OperationProblem();
	
	@Test
	void itShouldCheckIfMathFunctionWorks() {
		
		//given
		int  n1 = 4, n2 = 2, n3 = 8;
		
		//when
		String expected = "*";
		
		//then
		assertEquals(expected, opblm.mathFunction(n1,n2,n3));
		
	}

}
