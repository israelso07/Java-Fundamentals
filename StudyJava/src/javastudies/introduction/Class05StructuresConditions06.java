package javastudies.introduction;

public class Class05StructuresConditions06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte day = 1;

        switch (day){
            case 1, 7:
                System.out.println("Final de Semana"); break;
            case 2,3,4,5,6:
                System.out.println("Dia Útil"); break;
        }
    }
}
