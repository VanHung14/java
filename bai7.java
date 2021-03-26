
public class bai7 {
public static void songay(int a,int b)
{
	switch(a)
	{
	case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		System.out.println("so ngay: 31"); break;
	case 4:case 6:case 9:case 11:
		System.out.println("so ngay: 30"); break;
	case 2:
		if(b%4==0 && b%100!=0) System.out.println("so ngay: 29");
		else System.out.println("so ngay: 28");
	}
}
public static void main(String[] args)
{
	songay(2, 2016);
}
}
