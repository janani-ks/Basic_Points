package point;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Points implements Cloneable {
	static double x;
	static double y;
	static Scanner scan = new Scanner(System.in);
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	Points(double axis1,double axis2){
		x=axis1;
		y=axis2;
	}
	static boolean equals() {
		if(x==y)
			return true;
		else
			return false;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	static Points Clone(Points obj)throws CloneNotSupportedException{
		display.println("Enter new x and y axis : ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		Points obj1 = new Points(x,y);
		obj = (Points)obj1.clone();
		return obj1;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		display.println("Enter x and y axis : ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		Points obj = new Points(x,y);
		display.println("The x and y axis are same : "+Points.equals());
        obj = Points.Clone(obj);  
        display.println("The new x and y axis are "+Points.x +" and "+ Points.y);
        display.println("--------------------X---------------------");
	}
}


