public class Aparitii {
    public static void main (String[] args) {
        String text = args[0];
        char c = args[1].charAt(0);
        int i = 0;
        int occurrences = 0;
        while (i < text.length()) {
            if (text.charAt(i) == c) {
                occurrences++;
            }
            i++;
        }
        System.out.println("Character " + c + "appears " + occurrences + "times");
    }
}
