
public class bai13 {
public static int ucln(int a,int b)
{
	if(b==0) return a;
	return ucln(b, a % b);
}
public static int bcnn(int a,int b)
{
	return a*b/ucln(a, b);
}
public static void main(String[] args)
{
	System.out.println(ucln(6, 8));
	System.out.println(bcnn(6, 8));
}
}