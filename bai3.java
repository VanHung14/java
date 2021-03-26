
public class bai3 {
public static void ptb2(double a,double b,double c)
{
	double denta= b*b-4*a*c;
	if(denta<0) System.out.println("pt vo nghiem");
	else if(denta==0) System.out.println("pt co nghiem kep la: "+ -b/(2*a));
	else System.out.println("pt co 2 nghiem la:" + (-b+Math.sqrt(denta))/(2*a)+" "+(-b-Math.sqrt(denta))/(2*a));
}

public static void main(String[] args)
{
	ptb2(1, -4, 3);
}
}
