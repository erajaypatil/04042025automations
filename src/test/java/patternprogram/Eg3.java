package patternprogram;

public class Eg3 
{
	
	public static void main(String[] args)
	{
		// * * * * * * *
		//   * * * * *
		//     * * *
	    //       *
		
		
		int row=4;
		int colum=7;
		int space=0;
		int star=7;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;	
		}
		
		//       *
		//     * * * 
		//   * * * * *
		// * * * * * * *
		
		int row1=4;
		int colum1=7;
		int space1=3;
		int star1=1;
		
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
			star1=star1+2;
			space1--;
		}
		
		System.out.println("=====");
		//      *
		//     * *
		//    * * *
		//   * * * * 
		
		
		int row2=4;
	//	int colum2=4;
		int space2=3;
		int star2=1;
		
		for(int i=1;i<=row2;i++)
		{
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star2++;
			space2--;
		}
		
		
		// * * * *
		//  * * *
		//   * *
		//    *
		
		System.out.println("===========");
		
		int row3=4;
		int star3=4;
		int space3=0;
		
		
		for(int i=1;i<=row3;i++)
		{
			for(int j=1;j<=space3;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star3;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star3--;
			space3++;	
		}
		
		System.out.println("-----------");
		
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		int row4=9;
		int star4=5;
		int space4=0;
		int colum4=5;
		
		for(int i=1;i<=row4;i++)
		{
			for(int j=1;j<=star4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star4--;
			}
			else
			{
				star4++;
			}
		
		}
	}

	
}
