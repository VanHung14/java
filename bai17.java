
public class bai17 {
public static void sangNT(int n)
{
	boolean[] check=new boolean[n];
	for(int i=2;i<n;++i)
	{
		check[i]=true;
	}
	for(int i=2;i<n;++i)
	{
		if(check[i]==true)
		for(int j=2*i;j<n;j+=i)
		{
			check[j]=false;
		}
	}
	for(int i=2;i<n;++i)
	{
		if(check[i]==true)
			System.out.print(i+" ");
	}
}
public static void main(String[] args)
{
	sangNT(44);
}
}
