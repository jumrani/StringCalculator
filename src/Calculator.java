
public class Calculator {

	public static int add(String txt)
	{
		if(txt.isEmpty()) return 0;
		else if(txt.contains(","))
		{
			int res=0;
			String str[]=txt.split(",");
			for(int i=0;i<str.length;i++)
			{
				res+=Integer.parseInt(str[i]);
			}
			return res;
		}
		else
		return Integer.parseInt(txt);
	}
}
