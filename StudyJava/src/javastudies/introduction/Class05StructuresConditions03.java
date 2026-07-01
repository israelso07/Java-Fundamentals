package javastudies.introduction;

public class Class05StructuresConditions03 {
    public static void main(String[] args) {

        double salary = 6000;
        String menssageDonate = "I can donate 500 to DevDojo ";
        String menssageNoDonate = "I can't donate, but i can ";
        String result = salary > 5000 ? menssageDonate : menssageNoDonate;

        System.out.println(result);

    }
}
