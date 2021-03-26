
public class bai15 {
public static boolean kiemtra(int n)
{
	int i=(int)Math.sqrt(n);
	if(i*i==n) return true;
	return false;
}
public static void main(String[]args)
{
	System.out.println(kiemtra(6));
}
}
