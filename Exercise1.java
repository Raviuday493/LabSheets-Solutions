public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("Enter the"+i+"number");
			String name = br.readLine();
			int num=Integer.parseInt(name);
			sum = num+sum;
		}
		System.out.println("Your Result:"+sum);
}