//Second attempt

public class OperationProblem {
	
	public static void main(String[] args) {
		
		String res = mathFunction(5,2,10);
		System.out.println(res);
		
	}
	
	static String mathFunction(int a, int b, int c) {
		
		String op = "None", res = "";
		
		if(a + b == c) { //Addition operator
			op = "+";
			res += op;
		}
		
		if(a - b == c) { //Subtraction operator
			op = "-";
			res += op;
		}
		
		if(a * b == c) { //Multiplication operator
			op = "*";
			res += op;
		}
		
		if(a / b == c) { //Division operator
			op = "/";
			res += op;
		}
		
		if(op == "None") { //Default return
			res = op;
		}
		
		return res;
	}
	
}
