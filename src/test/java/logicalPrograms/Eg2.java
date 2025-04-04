package logicalPrograms;

public class Eg2 
{
 public static void main(String[] args)
 { 
	 int num=121;
	 int reve=0;
	 int palndromno=num;
	 while(num>0)
	 {
		 reve=reve*10+num%10;
		 num=num/10;
	 }
	
	 System.out.println(reve);
	 
	 if(reve==palndromno)
	 {
		 System.out.println("is palndrom no");
	 }
	 else
	 {
		 System.out.println("is not a palndrom no");
	 }
	 
	 
	 //palndrom string
	 
	 String name="madam";
	 int len=name.length();
	 String reve1="";
	 String palndromno1=name;
	 
	 for(int i=len-1;i>=0;i--)
	 {
		 reve1=reve1+name.charAt(i);
	 }
	 System.out.println(reve1);
	 if(reve1.equals(palndromno1))
	 {
		 System.out.println("is palandorm string");
	 }
	 else
	 {
		 System.out.println("is not a palandrom string");
	 }
	 
	 
	 
	 //

	//5. count digits in number

	int numb5=1452365;
	int count5=0;

	int reve5=0;
	
	while(num>=0)
	{
	   reve5=reve5*10+numb5%10;
	   count5=count5++;
	}
	System.out.println(reve5);

	 
	 
}
}
