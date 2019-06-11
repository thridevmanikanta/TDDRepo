package com.epam.pep;

public class Remove2A {
	String remove(String str)
	{
		if(str=="")
			return "";
		else if(str.length()==1)
		{
			if(str.charAt(0)=='A')
				return "";
			else
				return str;
		}
		else
		{
		if(str.charAt(0)=='A'&&str.charAt(1)=='A')
			return str.substring(2,str.length());
		else if(str.charAt(0)=='A')
			return str.substring(1,str.length());
		else if(str.charAt(1)=='A')
			return str.charAt(0) + str.substring(2,str.length());
		else
			return str;
		}
		
	}
}
