package String;

public class Chuoi {
	public static void main(String[] args) {
		String s1 = " hoc sinh ";
		String s2 = "GIAO VIEN";
		
		System.out.println(s2.toLowerCase());	// doi in hoa thanh in thuong
		
		System.out.println(s1.toUpperCase()); 	// doi in thuong thanh in hoa
		
		System.out.println(s1.trim());			// xoa space o 2 dau
		
		System.out.println(s2.length()); 		// lay do dai cua chuoi
		
		System.out.println(s2.charAt(2)); 		// lay ki tu thu 3 trong chuoi
		
		System.out.println(s2.replaceAll(s2, s1));	// thay the chuoi
		
		System.out.println(s1.equals(s2)); 		// so sanh phan biet chu hoa
		
		System.out.println(s2.equalsIgnoreCase(s2)); // so sanh khong phan biet chu hoa
		
		System.out.println(s1.contains(s2));	// kiem tra co chua hay khong
		
		
	}

}
