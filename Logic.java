package com.firstcalculator.logic;

public class Logic {
	
		
		public static int addNo(int a1, int a2)//create method for two number addition 
		{
			return a1+a2;
		}
		public static int subNo(int a1,int a2)//create method for two number subtraction
		{
			return a1-a2;
		}
		public static int mulNo(int a1,int a2)//create method for two number multiplication
		{
			return a1*a2;
		}
		
		public static int divNo(int a1, int a2)//create method for two number Division
	    {
	    	try {
	    	return a1/a2;
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	return a2;
	    	
	    }

	}



