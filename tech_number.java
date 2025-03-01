import java.util.Scanner;
class tech_number 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int sum=0;
		int count=1;
		int temp=n;
		int expo=1;
		while(n>0){
			count +=1;
			n=n/10;
		}
      for(int i=1;i<=(count/2);i++){
		  expo *=10;
	  }
	  int a=(temp/expo);
	  int b=(temp%expo);
	  int c=a+b;
	  int d=c*c;
	  if(temp==d){
		  System.out.println("tech number");
	  }
	  else
		  System.out.println("Not a tech Number");
	}
}
