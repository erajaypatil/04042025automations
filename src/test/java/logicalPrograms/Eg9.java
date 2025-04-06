package logicalPrograms;
public class Eg9
{
 public static void main(String[] args)
 {

	 //star pattern program
	 
	 int row=5;
	 int colum=5;
	 int star=1;
	 int space=2;
	 
	 for(int i=1;i<=row;i++)
	 {
		 for(int k=1;k<=space;k++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=star;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		 star=star+2;
		 space--;
		
	 }
	 
	// System.out.println("hi its Eg9 i am updated this class");
	 }
}
