package point;
import java.util.logging.Level;
import java.util.logging.Logger;
class BasicPoint implements Cloneable {
	static Logger l = Logger.getLogger("com.api.jar");
	String x;
	String y;
	BasicPoint(String x1,String y1){
		this.x=x1;
		this.y=y1;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	static void copyobject()throws CloneNotSupportedException{
		BasicPoint s = new BasicPoint("4.6","8");
		l.log(Level.INFO,()-> ""+(s.x).equals(s.y)); 
		BasicPoint s1 = (BasicPoint)s.clone();
		l.log(Level.INFO,()-> ""+s1.x+" "+s1.y);
}
}
public class Points
{
	public static void main(String[] args)throws CloneNotSupportedException {
		BasicPoint.copyobject(); 
		
		
	}
}

