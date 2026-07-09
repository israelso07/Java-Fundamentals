package javastudies.introduction;

public class Class06StructuresRepetition04 {
    public static void main(String[] args) {

        // Dado valor de um carro, descubra quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000 | valorTotal = 30000

        double valueTotal = 30000;
        double valueParcela = 1000;

        for (double i = valueParcela; i <= valueTotal; i++) {
            double parcela = valueTotal / valueParcela;
            if (parcela >= 1000)
            System.out.println("Parcelas: " + i);
        }

    }
}
