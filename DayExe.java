












class  DayExe{
	public static void main(String[] args) {

//1:
		int factor = 0;

		for (int i = 1;i <= 1000 ;i++){


			for (int j = 1;j < i;j++){
				if (i % j == 0){
					factor += j;
				}
			}

			if (i == factor){
				System.out.println(i);
			}
			//reset factor
			factor = 0;

		}

		System.out.println();

//2:
		for (int i = 6;i > 0;i--){

			for (int j = 1;j <= i;j++){

				System.out.print("*");

			}
			System.out.println();
		}
		
	}
}
