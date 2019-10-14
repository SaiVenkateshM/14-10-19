package assesment;
import java.util.*;
public class Program5 {
	static List<String> ls= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 pr = new Program5();
		Scanner sc = new Scanner(System.in);
		ls.add("Maruvada");
		ls.add("Nishchay");
		ls.add("Venkatesh");
		ls.add("Avinash");
		System.out.println(ls);
		System.out.println("After Shuffling");
		Collections.shuffle(ls);
		{
			for(String s:ls) {
				System.out.print(s +" ");
			}
		}

	}

}
