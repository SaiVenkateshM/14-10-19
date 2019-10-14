package assesment;
import java.util.*;

public class Program4 {
	static List<String> ls= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 pr = new Program4();
		Scanner sc = new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("After Sorting");
		Collections.sort(ls);
		{
			for(String a:ls) {
				System.out.print(a + " ");
			}
		}
	}
}
