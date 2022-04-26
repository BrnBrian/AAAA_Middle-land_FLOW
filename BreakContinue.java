










class  BreakContinue{
	public static void main(String[] args) {

		for (int i =1;i <= 10 ;i++ ){

			if (i % 4 == 0){
				//break;//output:123
				continue;//output:123567910
			}
			System.out.print(i);

		}
		System.out.println("\n");


		//exe2:

		label:for (int i = 1;i <= 4 ;i++){

			for (int j = 1;j <= 10;j++){

				if (j % 4 == 0){
					//break;//only function in the closest loop
					//continue;//only function in the closest loop

					//break label;//end designated loop
					continue label;//123123123123

				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
