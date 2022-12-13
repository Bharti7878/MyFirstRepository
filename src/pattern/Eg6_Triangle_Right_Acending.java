package pattern;

public class Eg6_Triangle_Right_Acending {

	public static void main(String[] args) {
		    // *
		   // **
		  // ***
		 // ****
		 //*****
		//row=5;column=5;space=4;
		
		int star=1;// star on first row, star = 1
		int space=4;// Space in first row, space = 4
		
		for(int i=1;i<=5;i++) { // Outer loop for No of Rows = 5
			
			for(int j=1;j<=space;j++) { // 1st inner loop : Space 
				System.out.print(" ");// Don't Use Println()
			}
		       for(int k=1;k<=star;k++) {
		    	   System.out.print("*");
		       }
		
		System.out.println();
		star++;
		space--;
		}
	}

}
