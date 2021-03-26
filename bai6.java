
public class bai6 {
public static void tinhtien(int a,int b)
{
	int tien=0;
	if(a<18) {
		if(b<18) tien+=(b-a)*45000;
		else tien+=(18-a)*45000+(b-18)*60000;
	}
	else {
		tien+=(b-a)*60000;
	}
	System.out.println(tien);
}
public static void main(String[] args)
{
	tinhtien(15, 22);
}
}
