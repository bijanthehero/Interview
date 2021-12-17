//First attempt

public class OneTwoThree {

	public static void main(String[] args) {
		
		String res = mathFunction(5,2,3);
		System.out.println(res);
		
	}
	
	static String mathFunction(int n1, int n2, int n3) {
		
		String a = "None", z = "";
		
		
		for(int index = 0; index < 4; index++){
			switch(index){
				case 0: //Addition
					if(n1 + n2 == n3) {
						a = "+";
						z += a;
					}
					break;
				case 1://Subtraction
					if(n1 - n2 == n3) {
						a = "-";
						z += a;
					}
					break;
				case 2: //Multiplication
					if(n1 * n2 == n3) {
						a = "*";
						z += a;
					}
					break;
				case 3: //Division
					if(n1 / n2 == n3) {
						a = "/";
						z += a;
					}
					break;
				default: z = "None";
					break;
			}
		}
		
		if(z == ""){
			z = "None";
		}
		return z;
		
	}

}