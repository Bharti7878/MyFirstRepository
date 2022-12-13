package pattern;

public class Eg7_Equilateral_Downward {

	public static void main(String[] args) {
		//*******
		 //*****
		 // ***
		  // *
		
		//row=4;column=4;space=0;
		int star=7;
		int space= 0;
		
		for(int i=1;i<=7;i++) {// Outer For Loop; Rows= 4
		
			for(int j = 1;j<=space;j++) {// Inner for Loop
				System.out.print(" ");
					}
			
			     for(int k=1;k<=star;k++) {// Inner for Loop
			    	 System.out.print("*");
			     }
		
		          System.out.println();
		          star=star-2;  // // Decrement of Star by 2
		          space++;// Increment of Space by 1
		
		}
	}

}
