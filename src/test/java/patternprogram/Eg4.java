package patternprogram;

import java.util.Scanner;

public class Eg4 {
	
	public static void main(String[] args) {
		/*
		1.swapping number
		2.reverse number
		3.reverse string
		4.check palndrom no
		5.check string palndrom
		6.count no of digits
		7.count even and odd no
		8.sum of the digits
		9.largers 3 numbers
		10.genrate fabionice series

       */
		
		//swappin number
		int a=10,b=20,c=0;
		a=a+b;
		b=a-b;//10
		a=a-b;;//20
		System.out.println("after swapping value of a is "+a);
		System.out.println("after swapping vlaue of b is "+b);
		
		//reverse number
		
		int num=12345;
		int reve=0;
		while(num>0)
		{
			reve=reve*10+num%10;
			num=num/10;
		}
		System.out.println(reve);
		
		//palndrom no
		
		int num1=121;
		int reve1=0;
		int palndromno1=num1;
		while(num1>0)
		{
			reve1=reve1*10+num1%10;
			num1=num1/10;
		}
		System.out.println(reve1);
		
		if(reve1==palndromno1)
		{
			System.out.println("given no is plandrom");
		}
		else
		{
			System.out.println("given no is not plandorm no");
		}
		
		//Reverse string
		
		String name1="AutomationTester";
		String reve2="";
		int len=name1.length();
		
		for(int i=len-1;i>=0;i--)
		{
			reve2=reve2+name1.charAt(i);
		}
		System.out.println(reve2);
		
		//String palndrom
		String name2="madam";
		String reve3="";
		String palnstring=name2;
		int len2=name2.length();
		
		for(int i=len2-1;i>=0;i--)
		{
			reve3=reve3+name1.charAt(i);
		}
		System.out.println(reve3);

		if(reve3.equals(palnstring))
		{
			System.out.println("its a palndrom string");
		}
		else
		{
			System.out.println("its a not a palndrom string");
		}
			
		
		//count no of digits
		
		int num2=12546;
		int rev2=0;
		int count=0;
		while(num2>0)
		{
		     num2=num2/10;
		     count++;
			
		}
		System.out.println("no of digits are "+count);
		
		//count even and odd no
		
		int num3=12345;
		int evenno=0;
		int oddno=0;
		int num4=0;
		
		while(num3>0)
		{
			int rem=num3%10;
			if(rem%2==0)
			{
			   	evenno++;
			}
			else
			{
				oddno++;
			}
			num3=num3/10;
		}
		System.out.println("evenno are "+evenno);
		System.out.println("oddno are "+oddno);
		
		//sum of the digits
		int num5=123546;
		int sum=0;
		int rev5=0;
		while(num5>0)
		{
			rev5=rev5+num5%10;
			num5=num5/10;
		}
		System.out.println("Total addition of number is "+rev5);
		
		//largest number compare it
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a1=s.nextInt();
		System.out.println("enter b number");
		int b1=s.nextInt();
		System.out.println("enter c number");
		int c1=s.nextInt();
		
		if(a1>b1&& a1>c1)
		{
			System.out.println("a1 is greater");
		}
		else if(b1>a1&& b1>c1)
		{
			System.out.println("b1 is greater");
		}
		else
		{
			System.out.println("c1 is greater");
		}
		
		//genrate fabionice series
		int num6=10;
		int num7=0;
		int num8=1;
		int sum8=0;
		
		for(int i=2;i<=num6;i++)
		{
			sum8=num7+num8;
			System.out.println(" "+sum8);
			num7=num8;
			num8=sum8;
		}
	//	System.out.println(num8+" ");

		
		
		
	}

}
