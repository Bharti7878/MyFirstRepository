package pattern;

public class E10_EquilateralTriangle_Downward_WithSpacing {

	public static void main(String[] args) {
		// // Equilateral Triangle Downward With Space
		 //* * * * * 
		 // * * * * 
		  // * * * 
		   // * * 
		    // *
	
	int star=5;
	int space=4;
   
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		  for(int k=1;k<=star;k++)
		  {
			  System.out.print("* ");
		  }
	
	          System.out.println();
	           star--;
	           space++;
	}
		

	
	
	}

}
