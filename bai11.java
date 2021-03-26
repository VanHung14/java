
public class bai11 {
public static void tinh(int n)
{
	int s=1;
	int i=n;
	while(i>1)
	{
		s*=i;
		i-=2;
	}
	System.out.println(s);
}
public static void main(String[] args)
{
	tinh(6);
}
}
