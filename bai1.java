
public class bai1 {
public static void max3(int a,int b,int c)
{	int max=a;
	if(max<b) max=b;
	if(max<c) max=c;
	System.out.println(max);
}
public static void main(String [] args) 
{
	max3(3,4,5);
}
}
