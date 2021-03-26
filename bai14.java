public class bai14 {
public static boolean kiemtra(int n)
{
	for(int i=2;i<Math.sqrt(n);++i)
	{
		if(n%i==0) return false;
	}
	return true;
}
public static void main(String[] args)
{
	System.out.print(kiemtra(11)); // true: la so NT, false: ko phai
}
}
