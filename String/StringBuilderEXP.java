package String;
import java.lang.*;

public class StringBuilderEXP {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Xin chao");
		
		sb.append(" Viet Nam");
		System.out.println(sb);
		
		sb.insert(2, "ABC");
		System.out.println(sb);
	
		sb.replace(1, 3, "JAVA");
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb.capacity());
		
	}
}
