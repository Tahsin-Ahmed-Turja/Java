import java.util.*;

public class Countfeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            a.add(input);
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : a) {
            if (!m.containsKey(i)) {
                m.put(i, 1);
            } else {
                m.put(i, m.get(i) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
