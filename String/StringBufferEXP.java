package String;
import java.lang.*;


public class StringBufferEXP {
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Hello ");
		
		// append de noi chuoi
		sbf.append("World");
		System.out.println(sbf);
		
		// insert de chen chuoi vao vi tri chi dinh
		sbf.insert(2, "ABC");
		System.out.println(sbf);
	
		// thay the ki tu tu 1 den 3 bang chuoi
		sbf.replace(1, 3, "JAVA");
		System.out.println(sbf);
		
		// xoa ki tu chuoi tu 1-5
		sbf.delete(1, 5);
		System.out.println(sbf);
		
		//dao nguoc chuoi
		sbf.reverse();
		System.out.println(sbf);
		
		//tra ve dung luong hien tai cua bo dem 
		sbf.capacity();
		System.out.println(sbf.capacity());
		
		
		
	}
}
