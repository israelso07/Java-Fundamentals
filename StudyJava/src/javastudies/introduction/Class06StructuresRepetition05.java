package javastudies.introduction;

public class Class06StructuresRepetition05 {
    public static void main(String[] args) {


        double valueTotal = 30000;

        for ( int parcela = (int) valueTotal ; parcela >= 1 ; parcela--) {
            double valueParcela = valueTotal / parcela;
            if (valueParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valueParcela );
        }

    }
}
