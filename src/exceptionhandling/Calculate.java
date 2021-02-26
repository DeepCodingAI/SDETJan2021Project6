package exceptionhandling;

public class Calculate {

	public static void main(String[] args) {
		int number = 10;
		
		try {
			int result = number/2;
			System.out.println(result);
		}catch(Exception ex){
			System.out.println("you can not divide a number by zero");;	
		}
		
		System.out.println("are you able to complete to the end of the prog");	

	}

}
