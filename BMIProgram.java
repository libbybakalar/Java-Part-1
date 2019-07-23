import java.util.Scanner;

public class BMIProgram {

	static Scanner consoleScanner;
	
	public static void main(String[] args) {
		int validWeight =0; 
		int validHeight=0;	
		int option=0;
		String again="Y";
		
		//calls init
		init();		
		
		do {
			System.out.println("Enter 1 for metric");
			System.out.println("Enter 2 for standard");
			System.out.println("Enter anything else to exit");
			option = Integer.parseInt(consoleScanner.next());			
			if (option == 1 || option == 2) {		
					validWeight = promptAndValidateWeight();
					validHeight = promptAndValidateHeight();
					BMI mass = new BMI(validWeight, validHeight, option);			
					output(mass);				 
			}
			System.out.print("Enter again? (Y or N): " );
        	again = consoleScanner.next();
		}
		while (again.toUpperCase().equals("Y"));{						
			System.out.print("Program ending"); 
			System.exit(1); 
		}		
		
	//bracket ends main
	}
	
	public static void init() {
		//console Scanner 
    	consoleScanner = new Scanner(System.in);
    	consoleScanner.useDelimiter(System.getProperty("line.separator"));
    	
    //bracket ends init	
	}
	
	public static int promptAndValidateWeight() {
		int weight = 0; 
    	boolean ok = true; 
    	
    	do {
    		ok = true;
    		try {
    			System.out.println("Enter Weight: ");
    			weight = Integer.parseInt(consoleScanner.next());
    		}
    		catch(Exception e) {
    			System.out.println("Weight must be numeric, re-enter");
    			ok = false; 
    		}
    		
    	}while(!ok);
    	
		return weight; 
		
	//bracket ends valid weight	
	}
	
	public static int promptAndValidateHeight() {
		int height = 0; 
    	boolean ok = true; 
    	
    	do {
    		ok = true;
    		try {
    			System.out.println("Enter Height: ");
    			height = Integer.parseInt(consoleScanner.next());
    		}
    		catch(Exception e) {
    			System.out.println("Height must be numeric, re-enter");
    			ok = false; 
    		}
    		
    	}while(!ok);
    	
		return height; 
		
	//bracket ends valid weeks	
	}

	public static void output(BMI mass) {
		System.out.println(mass.toString());
	}
	
//bracket ends class
}