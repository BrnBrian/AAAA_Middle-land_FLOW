public class StringTest{
	public static void main(String[] args) {
		int no = 10;
		String str = "abcdef";
		String str1 = str + "xyz" + no;

		str1 = str1 + "xyz" + "123";
		char c = '¹ú';

		double pi = 3.1416;
		str1 = str1 + pi;
		boolean b = false;
		str1 = str1 + b;
		str1 = str1 + c;
		String str2 = 3.5f + "o";


		System.out.println("str1 =" + str1 + str2);
		System.out.println(str2);
		System.out.println(3+4+"Hello!");
		System.out.println("Hello!"+3+4);
		System.out.println("Hello!"+'a'+1);
		System.out.println('a'+1+"Hello!");
	}
}
