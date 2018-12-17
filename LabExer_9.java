package com.example;

	class A
	{
		public String abc()
		{
			return "in A";
		}
	}
	class B extends A
	{
		String str="abc";
		
		public String abc()
		{
			str="";
			try
			{
			
			str.substring(4);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}


	public class LabExer_9 {
		public static void main(String[] args) {
			
			B b=new B();
			
			b.abc();
		}



}
