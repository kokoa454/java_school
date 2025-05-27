import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<Integer> months = new ArrayList<>();
		months.add(Integer.valueOf(1));
		months.add(Integer.valueOf(2));
		months.add(Integer.valueOf(3));
		months.add(Integer.valueOf(4));
		months.add(Integer.valueOf(5));

		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));
		}
	}
}
