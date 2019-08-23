
public class A1q5 {

	public static void main(String[] args) {
		double tax,salary=151000;
		
			if(salary>0 && salary<15000) {
				System.out.println("Base Tax = 0");
				tax=0+(salary*0.15);
				System.out.println("Tax is : " + tax);
				
			}
			if(salary>15000 && salary<30000) {
				System.out.println("Base Tax =2250");
			tax=2250+(salary*0.18);
			System.out.println("Tax is :" + tax); }
			
			
			if(salary>30000 && salary<50000) {
				System.out.println("Base Tax =5400");
			tax=5400+(salary*0.22);
			System.out.println("Tax is :"+ tax);  
			}
			
		if(salary>50000 && salary<80000) {
		System.out.println("Base Tax =11000");
		tax=11000+(salary*0.27);
		System.out.println("Tax is :"+ tax);}
		
		if(salary>80000 && salary<150000) {
			System.out.println("Base Tax =21600");
			tax=21600+(salary*0.33);
			System.out.println("Tax is:"+tax);
		}
		if(salary>150000) {
		System.out.println(-1);	
		
		
		
		
		}
			
	}
	
}
