package pattern;

public class eg3TriangleAscending {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		//Step 1: Count Rows = 05 Count Columns = 05
	//row=5; column=5;1st row condition star=1
	
    int star=1;// Write No of star in first Row
    for(int i=1;i<=5;i++)//outer loop is always row 
    {
    	for(int j=1;j<=star;j++) {//// Inner Loop for Columns
    		System.out.print("*");
    	}
       System.out.println(" ");// after printing star go on next line
       star++;                 // Increment in stars
    }
    
    
	
	
	
	}

}
