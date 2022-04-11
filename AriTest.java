/*
+, -, +, -, *, /, %, (front)++, (back)++, (front)--, (back)--, +


*/


class  AriTest{
	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2


        int result2 = num1 / num2 * num2;
		System.out.println("result2 = " + result2);//10

		double result3 = num1 / num2 * num2;
		System.out.println(result3);//10.0

		double result4 = num1 / (num2 + 0.0);
		System.out.println(result4);//2.4

		double result5 = num1 / (double)num2;
		System.out.println(result5);//2.4

		double result6 = 12 / (double)5;
		System.out.println(result6);//2.4

		int m1 = 12;
		int n1 = 5;
		int o1 = m1 % n1;
		System.out.println("o1 = " + o1);//2

		int m2 = -12;
		int n2 = 5;
		int o2 = m2 % n2;
		System.out.println("o2 = " + o2);//-2

		int m3 = 12;
		int n3 = -5;
		int o3 = m3 % n3;
		System.out.println("o3 = " + o3);//2

		int m4 = -12;
		int n4 = -5;
		int o4 = m4 % n4;
		System.out.println("o4 = " + o4);//-2

		int a1 =10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ", b1 = " + b1);

		int a2 =10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ", b2 = " + b2);


		int a3 =10;
		int b3 = --a3;
		System.out.println("a3 = " + a3 + ", b3 = " + b3);

		int a4 =10;
		int b4 = a4--;
		System.out.println("a4 = " + a4 + ", b4 = " + b4);

		int a5 =3510;
		int b5 = a5/1000*1000;
		System.out.println("b5 = " + b5);

		System.out.println("5+5 = " + 5+5);



	}
}
