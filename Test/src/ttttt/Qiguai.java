package ttttt;

public class Qiguai {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("123456789");
		System.out.println(s.insert(1, "24"));
		System.out.println(s.substring(3, 6));
		System.out.println(s.delete(0,3));
		System.out.println(s.replace(1, 3, "24"));

	}

}
