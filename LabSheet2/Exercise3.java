public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] arr  = new String[5];
		int[] brr = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter the "+i+"th movie");
			String name = sc.nextLine();
			arr[i]=name;
			System.out.println("Enter the rating");
			String ratingStr = sc.nextLine();
			brr[i]=Integer.parseInt(ratingStr);;
		}
		for(int i=0;i<5;i++) {
			System.out.println("Your movie is:"+arr[i]);
			
			System.out.println("Rating of this movie is:"+brr[i]);
			
		}
	}