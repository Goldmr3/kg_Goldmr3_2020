import java.util.Arrays;

public class Main {
	
	static int charSize = 256;
	
	public static void main(String[] args)
	{
		System.out.println(oneToOneMap("aab","xxy"));
	}
	public static boolean oneToOneMap(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		
		boolean checked[] = new boolean[charSize];
		Arrays.fill(checked, false);
		
		int map[] = new int[charSize];
		
		for(int i = 0; i < str2.length(); i++)
		{
			if(map[str1.charAt(i)] == 0)
			{
				if(checked[str2.charAt(i)] == true)
					return false;
				
				checked[str2.charAt(i)] = true;
				map[str1.charAt(i)] = str2.charAt(i);
			}
			
			else if(map[str1.charAt(i)] != str2.charAt(i))
				return false;
		}
		return true;
	}

}
