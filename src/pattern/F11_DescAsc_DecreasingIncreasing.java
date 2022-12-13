package pattern;

public class F11_DescAsc_DecreasingIncreasing {

	public static void main(String[] args) {
		//----------------------------------------
		 //*****
		 //****
		 //***
		 //**
		 //*
		 //**
		 //***
		 //****
		 //*****
		 //--------------------------------------
		 
		 //Step .1 Count Total no of Rows = 9; Use Outer for loop for No. of Rows
	
		int star=5;
		
		for(int i = 1;i<=9;i++) //// Outer for loop used for No. of Rows
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");// Inner for loop for Col
			}
		      System.out.println();
		     // star--;
		if(i<5)
		{
			star--;
		}
		else  // For Ascending star
		{
			star++;
		}
		
		
		
		
		}
		
	
	}

}
