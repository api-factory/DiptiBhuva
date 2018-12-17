package com.example;


public class LabExer_8 {

	public static void main(String[] args) {
		String s;
		
		try
		{
			 s="abc";
			s=null;
			s.charAt(1);
		}
		catch(Exception e) {
			e.printStackTrace();
			try
			{
				s="xyz";
				System.out.println(s);
			}
			catch(Exception ex) {
			 e.printStackTrace();
			}
			
		}
		

	}

}
