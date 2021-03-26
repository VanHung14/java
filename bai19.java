
public class bai19 {
public static void fibo(int n)
{
	int i=3;
	long f3;
	long f1=1,f2=1;
	while(i<=n)
	{
		f3=f2+f1;
		f1=f2;
		f2=f3;
		System.out.print(f3+" ");
		++i;
	}
}
public static void main(String[] args)
{
	System.out.print(1+" "+1+" ");
	fibo(300);
}
}
