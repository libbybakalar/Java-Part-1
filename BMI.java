import java.text.DecimalFormat;

public class BMI {
	//metric default weight=70(kilograms), height=170(centimeters)
	//standard default weight=154(pounds), height=67(inches)

	private int weight; 
	private int height; 
	private int option; 
	
	//default constructor
	public BMI() {
		this.weight = 70; 
		this.height = 170; 
		this.option = 1; 
	//bracket ends default bmi	
	}
	
	//overloaded constructor 
	public BMI(int w, int h, int o) {
		this.setWeight(w); 
		this.setHeight(h); 
		this.setOption(o);  
	//bracket ends overloaded bmi	
	}
	
	//getters 
	public int getWeight() { 
		return this.weight;
	}
	
	public int getHeight() {
		return this.height;
	}
		
	public int getOption() {
		return this.option;
	}
		
	//setters
	public void setWeight(int w) {
		//metric default = 70 kilograms
		//standard default = 154 pounds
		
		if (w > 0) {
			this.weight = w; 
		}
		else {
			if (option == 1) {
				this.weight= 170;
			}
			//option 2 (standard)
			else {
				this.weight=154;
			}			
		}
	//bracket ends set weight	
	}
	
	public void setHeight(int h) {
		//metric default = 170 centimeters
		//standard default = 67 inches
		
		if (h > 0) {
			this.height = h; 
		}
		else {
			if (option == 1) {
				this.height= 70;
			}
			//option 2 (standard)
			else {
				this.height=67;
			}			
		}
	//bracket ends set height	
	}
	
	public void setOption(int o) {
		this.option = o;
		
	//bracket ends set option
	} 
		
	private double calcs() {		
		double bmi; 
		double meters;
		
		if(option == 1) {
			//metric
			meters = (double)getHeight() / 100;
			bmi = ((double)getWeight() / (meters * meters)); 
		}
		else {
			//option = 2 (standard)
			bmi = (((double)getWeight() *703 ) / ((double)getHeight() * (double)getHeight()));
		}			 	
		 
		return bmi;
		
	//bracket ends calcs	
	}
	
	public String toString() {
		String word=""; 
		DecimalFormat df1 = new DecimalFormat(".00");
		String num = df1.format(this.calcs());  
		
		if (this.calcs() < 18.5) {
			word = "underweight";
		}
		if (this.calcs() >= 18.5 && this.calcs() <= 24.9 ) {
			word = "normal weight";
		}
		if (this.calcs() >= 25 && this.calcs() <= 29.9) {
			word = "overweight";
		}
		if (this.calcs() >= 30) {
			word = "obese";
		}
		
		return "BMI is " + num + " and is considered " + word + "\n" ; 
		
	//bracket ends to string	
	}			
//bracket ends class	
}