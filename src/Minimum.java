public class Minimum {
    public static void main (String[] args) {
        int[] values = {23,43,65,1,546,-34,56};
        int min = values[0];
        int i = 1;
        while (i < values.length){
            if (values[i] < min) {
                min = values[i];
            }
            i++;
        }
        System.out.println("Minimul este: " + min);
    }
}
