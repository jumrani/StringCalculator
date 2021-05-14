import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if(str.startsWith("//"))
		{
			Pattern pattern = Pattern.compile("//(.)\n(.*)");
		     Matcher matcher = pattern.matcher(str);
		     matcher.matches();
		     String patternstr=matcher.group(1);
		     String txtstr=matcher.group(2);
		     String sptstr[]=txtstr.split(Pattern.quote(patternstr));
		     return sptstr;
			
		}
		else
		{	
		String[] regstr=str.split(",|\n");
		return regstr;
		}
	}
}
