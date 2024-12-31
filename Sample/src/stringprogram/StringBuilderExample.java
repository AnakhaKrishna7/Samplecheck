package stringprogram;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder fd=new StringBuilder("anakha");
		System.out.println(fd);
		//append
		fd.append("length");
		System.out.println(fd);
		//insert 
		fd.insert(1, "krishna");
		System.out.println(fd);
		//replace
		fd.replace(3, 5,"replace");
		System.out.println(fd);
		//reverse
		fd.reverse();
		System.out.println(fd);
		//delete
		fd.delete(1, 4);
		System.out.println(fd);
		

	}

}
