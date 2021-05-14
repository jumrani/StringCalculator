
public class Calculator {

	public static int add(String txt)
	{
		if(txt.isEmpty()) return 0;
		else 
		{
			int res=0;
			String str[]=splitStr(txt);
			for(int i=0;i<str.length;i++)
			res+=Integer.parseInt(str[i]);
			return res;
		}
	}
	
	public static String[] splitStr(String str)
	{
		String[] regstr=str.split(",|\n");
		return regstr;
		
	}
}
