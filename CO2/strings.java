public class strings
{
	public static void main(String args[])
	{
		String s1="sngcee";
		String s2="sngce";
		System.out.println("String s1:"+s1);
		System.out.println("String s2:"+s2);
		int len=s2.length();
		System.out.println("Length of s2: " + len);
		System.out.println();
		
		String s3="college";
		System.out.println("String s3:"+s3);
		String joinedString = s2.concat(s3);
        System.out.println("Joined String of s2 &s3: " + joinedString);
		System.out.println();
		
		int res=s1.compareTo(s2);
        System.out.println("Compared s1&s2:"+res);
		System.out.println();
		
		String s="bat ball";
		System.out.println("Replaced string:");
		System.out.println(s.replace('b', 'c'));
		System.out.println();
		
		String str = "Learn\nJava Programming\n\n   ";
		System.out.println("Trimmed string:");
		System.out.println(str.trim());
		System.out.println();
		
		String str1 = "Java Programming";
		System.out.println("str1:"+str1);
		System.out.println("CharAt str1:");
        System.out.println(str1.charAt(2));
		System.out.println();
		
		String str2 = "java is fun";
		System.out.println("str2:"+str2);
		System.out.println("Substring of str2:");
 		System.out.println(str2.substring(0, 4));
		System.out.println();


	}
}