package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LabExer_7 {
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"dipti","Bhuva");
		Employee emp2=new Employee(2,"dip","Atko");
		Map<String,Employee> mp=new HashMap<String,Employee>();
		mp.put("emp1",emp1);
		mp.put("emp2",emp2);
		Iterator<Map.Entry<String,Employee>> itr = mp.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Employee> i=itr.next();
			System.out.println("key=="+i.getKey()+"  value== empId="+i.getValue().getEmpId()+"empFirstName="+i.getValue().getEmpFirstName()+"empLastName="+i.getValue().getEmpLastName());
		}
	}

}
