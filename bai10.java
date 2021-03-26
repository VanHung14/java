
public class bai10 {
	public static int giaithua(int n)
	{
		if(n==1) return 1;
		return n*giaithua(n-1);
	}
	public static void tinh(int n) 
	{
		double s=0;
		int i=1;
		while(i<=n)
		{
			s+=1/(1.0*giaithua(2*i-1));
			i++;
		}
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		tinh(2);
	}
}
