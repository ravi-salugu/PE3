
public class vowel_extract {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Orange", "Grapes"};
        for (int j = 0; j < fruit.length; j++) {
            for (int i = 0; i < fruit[j].length(); i++) {
                char ch = fruit[j].charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    continue;
                } else System.out.print(ch);
            }
            System.out.println();

        }
    }
}
