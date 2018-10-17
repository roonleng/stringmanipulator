/**
 * 
 * @author rlong19
 *
 */
public class StringManipulator
{
	private String string;
	public String noVowels(String string)
	{
		String str= "";
		for (int i=0; i<string.length(); i++)
		{
			char letter= string.charAt();
			if (letter== 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter =='u')
			{
				str+="*";
			}
			else
			{
				str+=string.charAt(i);
			}
		}
		return;
	}
	public void reverse(String string)
	{
		String streverse
		for (int i=string.length(); i=0; i--)
		{
			streverse+=string.charAt(i)
		}
	}
}