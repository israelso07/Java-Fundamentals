package javastudies.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {

        // If no initializing the variables;
        // byte, short, int, long. float e double = 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String [] names = new String[5];

        names[0] = "Goku";
        names[1] = "Gohan";
        names[2] = "Goku Black";
        names[3] = "Luffy";
        names[4] = "Anbu Itachi";

        for (int i = 0; i <  names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
