
//pt ax+b=0
public class bai2 {
public static void ptb1(double a,double b) {
	if(a==0)
	{
		if(b==0) System.out.println("pt vo so nghiem");
		else System.out.println("pt vo nghiem");
	}
	else {
		System.out.println("pt co nghiem x = "+ -b/(a*1.0));
	}
}
public static void main(String[] args) {
	ptb1(3, 0);
}
}
