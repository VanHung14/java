
public class bai12 {
public static void tinh(int n)
{
	int s=0;
	int t=1;
	while(n>0)
	{
		s+=n%10;
		t*=n%10;
		n=n/10;
	}
	System.out.println("tong :" +s);
	System.out.println("tich :" +t);
}
public static void main(String [] args)
{
	tinh(234);
}
}
