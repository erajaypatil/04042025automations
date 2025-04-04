package logicalPrograms;

import java.util.HashMap;

public class Eg10
{

	public static void main(String[] args) 
	{
		int no=12345;
		
		int reve=0;
		
		while(no>0)
		{
			reve=reve*10+no%10;
			no=no/10;
		}
		System.out.println(reve);	
		
		
		//reverse string 
		String name="We love AjayRokade We love maharashtra";
		int len=name.length();
		String reve1="";
		for(int i=len-1;i>=0;i--)
		{
			reve1=reve1+name.charAt(i);
		}
		System.out.println(reve1);
		
		
		//find duplicate charaters from string
		
		String name1="enginnering";
		
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<=name1.length()-1;i++)
		{
			char temp=name1.charAt(i);
			if(mp.containsKey(temp))
			{
				mp.put(temp,mp.get(temp)+1);
			}
			else
			{
				mp.put(temp, 1);
			}
			
		}
		
		System.out.println(mp);
		
		
		//find out duplicate string 
		System.out.println("============= find duplicate string ========");
		
		String name2="i love pune i love maharashtra";
		
		String[] ar = name2.split("");
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String temp1=ar[i];
			if(hm.containsKey(temp1))
			{
				hm.put(temp1, hm.get(temp1)+1);
			}
			else
			{
				hm.put(temp1,1);
			}
		}
		System.out.println(hm);
		
		
	}
}
