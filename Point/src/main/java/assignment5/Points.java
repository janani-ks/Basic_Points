package assignment5;

import java.util.logging.Logger;
import java.util.logging.Logger;
class BasicPoint implements Cloneable {
	static Logger l = Logger.getLogger("com.api.jar");
	String x,y;
	BasicPoint(String x1,String y1){
		this.x=x1;
		this.y=y1;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	static void Clone(){
		try {
		BasicPoint s = new BasicPoint("4.6","8");
		l.info(""+(s.x).equals(s.y)); 
		BasicPoint s1 = (BasicPoint)s.clone();
		l.info(s1.x+" "+s1.y);
		}
		catch(CloneNotSupportedException c) {}
}
}
public class Points
{
	public static void main(String[] args) {
		BasicPoint.Clone(); 
		
		
	}
}

