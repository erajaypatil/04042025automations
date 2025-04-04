package patternprogram;

import java.util.Arrays;
import java.util.Random;

import net.bytebuddy.utility.RandomString;

public class Eg5 {
	
	public static void main(String[] args) 
	{
		System.out.println("hi");
		/*
		11.check given no is prime or not
		12.genrate the random string
		13.input and addition, mul, division, perform
		14.count no of white space
		15.count repeated characters from string
		16.find string palndrom or not
		17.find angram string
		18.find factorial of no
		19.count and print vowels
		20.remove vowels

*/
		
		//check given no is prime or not
		
		int num=11;
		
		if(num%2==0)
		{
			System.out.println("its even no");
		}
		else
		{
			System.out.println("its odd no ");
		}
		
		//genrate random string
		
	    	String ra=RandomString.make();
	    	System.out.println();
	    	
	   //count no of white space in string
	    	String name="a j a y";
	    	int count=0;
	    	for(int i=0;i<=name.length()-1;i++)
	    	{
	    		int temp=name.charAt(i);
	    		if(temp==' ')
	    		{
	    			count++;
	    		}
	    	}
	    	System.out.println("no of white spaces are "+count);
	    	
	    	//count repeted characters from string
	    	String name1="engineering";
	        int count1=0;
	        
	        for(int i=0;i<=name1.length()-1;i++)
	        {
	        	int temp1=name1.charAt(i);
	        	if(temp1=='e')
	        	{
	        		count1++;
	        	}
	        }
	        System.out.println("repated character are "+count1);
	        
	        //find angram string
	        String name2="Ajay";
	        String name3="yjAa";
	        
	        char[] ar1 = name2.toCharArray();
	        char[] ar2 =name3.toCharArray();
	        
	        Arrays.sort(ar1);
	        Arrays.sort(ar2);
	        
	        if(Arrays.equals(ar1, ar2))
	        {
	        	System.out.println("given string is angram");
	        }
	        else
	        {
	        	System.out.println("given string is not angram");
	        }
	        
	        //find factorial of no 4
	        int number3=5;
	        int factorial=1;
	        
	        for(int i=number3;i>=1;i--)
	        {
	        	factorial=i*factorial;
	        }
	        System.out.println("factorial of "+number3+" is "+factorial);
	        
	        //count and print vowels
	        
	        String name4="automation";
	        int count4=0;
	        String n5="";
	        for(int i=0;i<name4.length()-1;i++)
	        {
	        	char te=name4.charAt(i);
	        	if(te=='a'||te=='i'||te=='o'||te=='u'||te=='e')
	        	{
	        		continue;
	        	}
	        	n5=n5+te;
	        	
	        }
	        System.out.println("Remove vowels "+n5);
	        
		
	}

}
