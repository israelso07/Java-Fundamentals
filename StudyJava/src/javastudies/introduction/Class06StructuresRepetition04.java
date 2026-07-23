package javastudies.introduction;

public class Class06StructuresRepetition04 {
    public static void main(String[] args) {
        //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado/
        // Condicao valueParcela >= 1000

        double valueTotal = 30000;

        for (int parcela = 1; parcela <= valueTotal; parcela++) {
            double valueParcela = valueTotal / parcela;
            if (valueParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valueParcela);
            } else {
                break;
            }

        }

    }
}
