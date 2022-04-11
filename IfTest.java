






class  IfTest {
	public static void main(String[] args) {


		//Example 1:
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("Further exam");
		}

		System.out.println("Exam finished");

		//Example 2:
		int age = 23;
		if(age < 18){
			System.out.println("night club declined");
		}else{
			System.out.println("Admission accepted");
		}

		//Example 3:
		if (age < 0){
			System.out.println("Invalid Input");
		}else if(age < 18){
			System.out.println("Teenager");
		}else if(age < 35){
			System.out.println("Man");
		}else if(age < 60){
			System.out.println("Mid age");
		}else if(age < 120){
			System.out.println("Elder");
		}else{
			System.out.println("Peng");
		}

		//Example 4:

		int ypScore = 60;
		if (ypScore == 100){
			System.out.println("ybq will give yp a BMW as a gift.");
		}else if(ypScore < 100 & ypScore > 80){
			System.out.println("ybq will give yp a IPhone xs Max as a gift.");
		}else if(ypScore <= 80 & ypScore >= 60){
			System.out.println("ybq will give yp a IPad as a gift.");
		}else{
			System.out.println("ybq will give a shit");

		}

		//Example 5:

        //answer1:
		int num1 = 450;
		int num2 = 33;
		int num3 = 4550;
		if (num1 >= num2 & num2 >= num3){
			System.out.println(num3 + "<=" + num2 + "<=" + num1);
		}else if(num1 >= num3 & num2 <= num3){
			System.out.println(num2 + "<=" + num3 + "<=" + num1);
		}else if(num2 >= num1 & num1 >= num3){
			System.out.println(num3 + "<=" + num1 + "<=" + num2);
		}else if(num2 >= num3 & num3 >= num1){
			System.out.println(num1 + "<=" + num3 + "<=" + num2);
		}else if(num3 >= num2 & num2 >= num1){
			System.out.println(num1 + "<=" + num2 + "<=" + num3);
		}else{
			System.out.println(num2 + "<=" + num1 + "<=" + num3);
		}

		int x = 4;
        int y = 1;
        if (x > 2) {
             if (y > 2) 
                     System.out.println(x + y);
             System.out.println("atguigu");
        }else{
             System.out.println("x is " + x);
		}

        boolean b = true;
        //如果写成if(b=false)能编译通过吗？如果能，结果是b.
        if(b == false) 
			System.out.println("a");
        else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");

		//Example 6:

		int num4 = 5;
		int num5 = 6;
		if ((num4 + num5) >= 50){
			System.out.println("hello world");
		}else{
			System.out.println("smaller than 50");
		}

		//Example 7:

		double num6 = 15.3;
		double num7 = 6.55;
		if (num6 > 10.0 & num7 < 20.0){
			System.out.println("dd=" + (num6 + num7));
		}else{
			System.out.println(num6*num7);
		}


		//Example 8:

		double dogAge = -6;
		double humanAge = 0;
		if (dogAge < 0){
			System.out.println("Invalid Input");
		}else{
			if (dogAge < 3){
				humanAge = 10.5 * dogAge;
			}else{
				humanAge = 10.5 * 2.0 + (4.0 * (dogAge - 2.0));
			}
			System.out.println(humanAge);
		}



	}
}
