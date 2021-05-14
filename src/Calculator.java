import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String txt)
	{
		if(txt.isEmpty()) return 0;
		else 
		{
			List<String> nglist = new ArrayList<String>();
			int res=0;
			String str[]=splitStr(txt);
			for(int i=0;i<str.length;i++)
			{
				if(Integer.parseInt(str[i])> 0  && Integer.parseInt(str[i])< 1000) res+=Integer.parseInt(str[i]);
				else if(Integer.parseInt(str[i])< 0) nglist.add(str[i]);
			}
			if(nglist.size()>0)
				throw new RuntimeException("Nagatives not allowed: "+ String.join(",", nglist));
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
