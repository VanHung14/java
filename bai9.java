
public class bai9 {
public static int giaithua(int n)
{
	if(n==1) return 1;
	return n*giaithua(n-1);
}
public static void tinh(int n)
{
	double s=15;
	int i=1;
	while(i<=n)
	{
		s+=Math.pow(-1.0,i*1.0)*(1.0/giaithua(i));
		i++;
	}
	System.out.println(s);
}
public static void main(String[]args)
{
	tinh(2);
}
}
