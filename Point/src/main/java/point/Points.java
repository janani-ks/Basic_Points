package point;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Points implements Cloneable {
	double x;
	double y;
	static Scanner scan = new Scanner(System.in);
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	Points(double axis1,double axis2){
		x=axis1;
		y=axis2;
	}
	boolean equals() {
		boolean b;
		if(x==y)
			b = true;
		else
			b = false;
		return b;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	static Points cloneobj()throws CloneNotSupportedException{
		display.println("Enter new x and y axis : ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		Points obj1 = new Points(x,y);
		Points obj2 = (Points)obj1.clone();
		return obj2;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		display.println("Enter x and y axis : ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		Points obj = new Points(x,y);
		display.println("The x and y axis are same : "+obj.equals());
        obj = Points.cloneobj();  
        display.println("The new x and y axis are "+obj.x +" and "+obj.y);
        display.println("--------------------X---------------------");
	}
}


