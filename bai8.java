
public class bai8 {
public static void tinh(int n)
{	double s=0;
	int i=1;
	while(i<=n) {
		s+=1.0/(1.0*i);
		i++;
	}
	System.out.println(s);
}
public static void  main(String[]args)
{
	tinh(2);
}
}
