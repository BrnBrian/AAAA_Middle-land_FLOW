


class  MultiLoop {
	public static void main(String[] args) {


		/*

		*****
		*****
		*****
		*****
		*****

		*/

		for (int j = 1;j < 5 ;j++ ){
			for (int i = 1;i < 6;i++ ){
				System.out.print("*");
			}
			System.out.println();
		}

		/*

		*
		**
		***
		****
		*****

		*/

		for (int h = 1;h < 6 ;h++ ){

			for (int l = 1;l <= h;l++ ){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n");



		/*

		*****
		****
		***
		**
		*

		*/

		for (int j = 5;j > 0 ;j-- ){
			for (int i = 1;i <= j;i++ ){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n");


/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    * 
*/

		for (int i = 0;i < 5 ;i++){
			for (int j = 0;j < 4 - i;j++ ){
				System.out.print(" ");
			}
			for (int k = 0;k < i + 1 ;k++ ){
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int i = 0;i < 4 ;i++){
			for (int j = 0;j < i + 1;j++ ){
				System.out.print(" ");
			}
			for (int k = 0;k < 4 - i ;k++ ){
				System.out.print("* ");
			}
			System.out.println();

		}
		



	}
}
