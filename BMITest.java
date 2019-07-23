
public class BMITest {

	public static void main(String[] args) {
		//instantiate two bmis, one default and one with data		
		BMI one = new BMI();
		BMI two = new BMI(80,175,1);
		BMI three = new BMI(180,66,2);
			
		//print them out 
		System.out.println("BMI Calculator \n");
		System.out.println(one.toString());
		System.out.println(two.toString());			
		System.out.println(three.toString());
		
	//bracket ends main
	}	
//bracket ends class
}
