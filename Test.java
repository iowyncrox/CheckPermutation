import java.util.Arrays;

public class Test {
	
	public static String sort(String str) {
		char[] array = str.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}
	
	public static boolean isPermutation(String str1, String str2) {
		String value1 = sort(str1);
		String value2 = sort(str2);
		return value1.equals(value2);
	}
	
	public static void main(String[] args) {
		String name1 = "allgorithma";
		String name2 = "algolthmria";
		System.out.println(isPermutation(name1, name2));
 	}
}