package patternprogram;

import java.util.Arrays;
import java.util.HashMap;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.NoSubSpaceException;

public class Eg1 
{
	public static void main(String[] args)
	{
	
		/*
		21.revrse no using string method
		22.shift zeros to left
		23.shift zeros to right
		24.hasmap study
		25.linkedhashmap study
		26.treemap study
		27.find the duplicate characters from string
		28.find the duplicate string from string
		29.reverse part of string

		*/
		
		//shift zero to left
		
		int a[]= {1,0,2,0,3,0,4};
		int count=0;
		int a1[]=new int[a.length];
		//HashMap<String, Integer> jj=new HashMap<String, Integer>();
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		int index=count;
		System.out.println(index);
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				a1[index]=a[i];
				index++;
			}
			System.out.println(a1[i]+" ");
		}
		
		//shift zero to right 
		
		System.out.println("shift zreo to right sides ");
		
		int b1[]={1,0,2,0,3,0,4};
		int b2[]=new int[b1.length];
		int index1=0;
		
		for(int i=0;i<=b1.length-1;i++)
		{
			if(b1[i]!=0)
			{
				b2[index1]=b1[i];
				index1++;
			}
		}
		
		for(int i=0;i<=b2.length-1;i++)
		{
			System.out.println(b2[i]+" ");
		}
		
		
		//hasmap study
		HashMap<String, Integer> hh=new HashMap<String, Integer>();
		hh.put("Ajay", 121);
		hh.put("Ashish", 1551);
		System.out.println(hh);
		
		System.out.println(hh.get("Ajay"));
		System.out.println(hh.size());
		System.out.println(hh);
		
		//find duplicate characters from string
		
		String na="automation";
		//String na1[]=na.split("");
		
		HashMap<Character, Integer> ss=new HashMap<Character,Integer>();
		for(int i=0;i<=na.length()-1;i++)
		{
			char te=na.charAt(i);
			if(ss.containsKey(te))
			{
				ss.put(te,ss.get(te)+1);
			}
			else
			{
				ss.put(te, 1);
			}
			
		}
		System.out.println(ss);
		
		//find out duplicate string inside string
		
		String name=("I LOVE PUNE I LOVE NANDED");
		String[] ar=name.split("");
		HashMap<String, Integer> ff=new HashMap<String,Integer>();
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String temp=ar[i];
			
			if(ff.containsKey(temp))
			{
				ff.put(temp, ff.get(temp)+1);
			}
			else
			{
				ff.put(temp, 1);
			}
			
			
		}
		System.out.println(ff);
		
		/*
		30. sum of the element in array
		31. print even and odd no form array
		32. check equalty of array
		33. find missing no from array
		34. find the max value from array
		35. how to find duplicate element in array
		36. find and count duplicate elements in array
		37. find and count duplicate element in string array
		38. find the lowest and highest element in array

		*/
		
		//sum of the array
		
		int c1[]= {1,2,3,5};
		int sum=0;
		
		for(int i=0;i<=c1.length-1;i++)
		{
			sum=sum+c1[i];
		}
		System.out.println(sum);
		
		//print even and odd no from array
		
		int d1[]= {1,2,3,4,5,6,7};
		int evenno=0;
		int oddno=0;
		for(int i=0;i<=d1.length-1;i++)
		{
			if(d1[i]%2==0)
			{
				evenno++;
			}
			else
			{
				oddno++;
			}
			
		}
		System.out.println(evenno);
		System.out.println(oddno);
		
		
		//check equlity of array
		
		int e1[]= {1,2,3,4};
		int e2[]= {2,1,3,4,5};
		
		Arrays.sort(e1);
		Arrays.sort(e2);
		
		System.out.println(Arrays.equals(e1, e2));
		
		//find missing no from array
		
		int f1[]= {1,2,3,5};
		int sumf1=0;
		
		for(int i=0;i<=f1.length-1;i++)
		{
			sumf1=sumf1+f1[i];
		}
		System.out.println(sumf1);
		
		int f2[]= {1,2,3,4,5};
		int sumf2=0;
		for(int i=0;i<=f2.length-1;i++)
		{
			sumf2=sumf2+f2[i];
		}
		System.out.println(sumf2);
		System.out.println("missing no from array are  "+(sumf2-sumf1));
		
		//find max value from array
		
		int[] g1= {1,2,3,8,5,4,10,6};
		int max=0;
		for(int i=0;i<=g1.length-1;i++)
		{
			if(g1[i]<max)
			{
				max=g1[i];
			}
		}
		
		System.out.println("max vlaue from array is "+max);
		
		
		
		
		
		
	}

}
