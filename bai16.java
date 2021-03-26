
public class bai16 {
public static boolean kiemtra(int n)
{
	int tam=0,r,a=n;
	for(;a!=0;a/=10)
	{
		r=a%10;
		tam=tam*10+r;
	}
	if(tam==n) return true;
	return false;
}
public static void main(String [] args)
{
	System.out.println(kiemtra(131));
}
}
