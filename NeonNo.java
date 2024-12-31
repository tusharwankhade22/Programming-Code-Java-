class NeonNo
{
	public static void main(String[] args) 
	{
		int num=9;
		int sum=0;

		for(int square=num*num;square>0;square/=10){
			sum+=square%10;
		}
		System.out.println("The given number "+num+(num==sum?" is":" is not")+" a Neon Number");

		//int square=num*num;
		//while(square>0){
			//int ld=square%10;
			//sum+=ld;
			//square/=10;
		//}
		//if(num==sum)
			//System.out.println("The given number "+num+" is Neon Number!");
	}
}
