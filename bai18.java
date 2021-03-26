
public class bai18 {
public static boolean kiemtra(int n)
{
	int s=0;
	for(int i=1;i<=n/2;++i)
	{
		if(n%i==0) s+=i;
	}
	if(s==n) return true;
	return false;
}
public static void main(String[] args)
{
	for(int i=1;i<1000;++i)
	{
		if(kiemtra(i)) System.out.println(i+" ");
	}
}
}
