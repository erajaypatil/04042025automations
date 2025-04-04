package patternprogram;

public class Eg2 
{
	public static void main(String[] args) 
	{
		
		// * * * * * 
		
		// *
		// *
		// *
		// *
		// *
		
		// * * * * *
		// * * * * *
		// * * * * *
		
		
		// * * * * *
		// * * * *
		// * * *
		// * * 
		// *
		
		// *
	    // * *
		// * * *
		// * * * *
		// * * * * *
		
		
		// * * * * *
		//   * * * *
		//     * * *
		//       * *
		//         *
		
		//          *
		//        * *
		//      * * *
		//    * * * *
		//  * * * * *
		 
		
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.print("* ");
			
		}
		System.out.println("/////////////////");
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("*");
		}
		
		System.out.println("========");
		
		
		int row=3;
		int colum=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=colum;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("==========");
		
		//*
		//**
		//***
		//****
		//*****
		
		//*****
		//****
		//***
		//**
		//*
		
		
		int row1=5;
		int colum1=5;
		int star1=1;
		int space1=0;
		
		for(int i=1;i<=row1;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1++;
			space1--;
		}
		
		System.out.println("============");
		
		
		int row2=5;
		int colum2=5;
		int space2=0;
		int star2=5;
		
		for(int i=1;i<=row2;i++)
		{
			for(int j=1;j<=space2;j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star2--;
			space2++;
		}
		
		
		System.out.println("============");
		        // * * * * *
				// * * * *
				// * * *
				// * * 
				// *
				
				// *
			    // * *
				// * * *
				// * * * *
				// * * * * *
		
		
		int row3=5;
		int colum3=5;
		int space3=0;
		int star3=5;
		
		for(int i=1;i<=row3;i++)
		{
			for(int j=colum3;j<=colum3;j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=star3;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star3--;
			space3++;
		}
		
		
		System.out.println("==========");
		int row4=5;
		int colum4=5;
		int space4=5;
		int star4=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space4;j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=star4;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star4++;
			//space4--;
		}
		
		
		System.out.println("----------------");

		// * * * * *
		//   * * * *
		//     * * *
		//       * *
		//         *
		
		//          *
		//        * *
		//      * * *
		//    * * * *
		//  * * * * *
		
		
		int row5=5;
		int colum5=5;
		int star5=5;
		int space5=0;
		
		for(int i=1;i<=row5;i++) 
		{
			for(int j=1;j<=space5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star5--;
			space5++;
		}
		
		
		
		int row6=5;
		int colum6=5;
		int star6=1;
		int space6=4;
		
		for(int i=1;i<=row6;i++) 
		{
			for(int j=1;j<=space6;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star6;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star6++;
			space6--;
		}
		
		
		
	}

}
