package lesson_22;

public class Main {
    public static void main(String[] args) {
        label: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(j);
                if (j == 30) {
                    break label;
                }
            }
        }
        // Auto correction
        // wgat -> what
        // helo -> hello
        // worldx -> world
        // somethign -> something


        // mun -> fun, run, nun, munk
        // wrong word -> List{probably right words}
    }
}
