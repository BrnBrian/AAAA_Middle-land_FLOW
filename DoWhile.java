








class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;//count QTY
		int sum = 0;//total
		do{
			if (i % 2 == 0){
				System.out.println(i);
				count += 1;
				sum += i;
			}

			i++;

		}while (i < 101);
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);

	}
}
