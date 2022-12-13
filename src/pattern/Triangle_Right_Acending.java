package pattern;

public class Triangle_Right_Acending {

	public static void main(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *
		//rorw=5;column=5;space=0;
		int star=5;   // Outer Loop for the No of Rows = 5 
		int space=0;  // On the First Row there is no space, space = 0;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=space;j++) {  //1st consider inner for loop for the Space
				
				System.out.print(" ");
			}
			   for(int k=1;k<=star;k++) {
				   System.out.print("*");
			   }
		        System.out.println(" ");
		       star--;
		       space++;
		
		}
		
		
		
	}

}
