public class AdditionCommand {
	
	public static void main(String args[]){
		
		int first;
		int second;
		int sum;
		first=Integer.parseInt(args[0]);
		second=Integer.parseInt(args[1]);
		sum=first+second;
		
		System.out.println("sum of" +first+ " and " +second+ " is :" +sum);
		
		
	}

}
