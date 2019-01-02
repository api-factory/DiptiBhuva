package mulebasics01;

public class CompanyService {
	public String getCompanyName(String nameStart)
	{
		if(nameStart.equalsIgnoreCase("W"))
		{
			return "Wipro";
		}
		else if(nameStart.equalsIgnoreCase("I"))
		{
			return "Infosys";
		}
		else
		{
			return "Amdocs";
		}
	}
}
