
public class bai5 {
public static void sotg(double a,double b,double c)
{
	if(a<b && a>c || a<c && a>b) System.out.println("So trung gian la :"+a);
	else if(b>c && b<a || b<c && b>a) System.out.println("So trung gian la :"+b);
	else if(c>b && c<a || c<b && c>a) System.out.println("So trung gian la :"+c);
	else System.out.println("ko co so trung gian");
}
public static void main(String []args)
{
	sotg(3,3,4);
}
}
