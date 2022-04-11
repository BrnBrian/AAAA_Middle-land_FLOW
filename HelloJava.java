/*
1. 
single comment
multi comment
doc comment(only in java)

2. 
Comment for explanation:
Explain code, readable for both others and yourself
Adjust code

3. single and multi comments are not onvolved in programming. .class doc does not have comments

4. doc comment:
	注释内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。

5. multi comment cannot be put into multi comment

*/

/**
doc comment
@author Brian
@version v1.0
First java programme
*/

public class HelloJava{
	/*
	Single comment: main is the API
	Main is fixed
	*/
	/**
	main() is the entrance of programme
	*/
	public static void main(String[] args){
		//single comment: see below for command
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
}
