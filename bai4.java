
public class bai4 {
public static void hptb1(double a,double b,double c,double d,double e,double f)
{
	double D = a * e - d * b;
    double Dx = c * e - f * b;
    double Dy = a * f - d * c;
    if (D == 0) {
        if (Dx + Dy == 0)
            System.out.println("He phuong trinh co vo so nghiem");
        else
            System.out.println("He phuong trinh vo nghiem");
    }
    else {
        double x = Dx / D;
        double y = Dy / D;
        System.out.println("He phuong trinh co nghiem x, y = "+ x+", "+ y);
    }
    
}
public static void main(String [] args)
{
	hptb1(1, 2, 4, 5, 4, -1);
}
}
