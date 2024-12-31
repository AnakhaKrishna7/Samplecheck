package stringprogram;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		//append
		sb.append("world");
		System.out.println(sb);
		//insert
		sb.insert(1," hi ");
		System.out.println(sb);
		//replace
		sb.replace(3, 5, " add ");
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
		//delete
		sb.delete(2, 9);
		System.out.println(sb);
		

	}

}
