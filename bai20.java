
public class bai20 {
public static void fibo(long n)
{
	int i=3;
	long f3;
	long f1=1,f2=1;
	while(i<=1000)
	{
		f3=f2+f1;
		f1=f2;
		f2=f3;
		if(n==f3)
		{
			System.out.print("co, vi tri o: "+i);
			break;
		}
		++i;
	}
}
public static void main(String[] args)
{
	fibo(7860086430977039991l);
}
}
