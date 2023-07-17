public class Solution {
    public static double custoCompra(double input) {
        double precoUnitario;
        double valorTotal;

        if (input > 10) {
            precoUnitario = 1.25;
        } else {
            precoUnitario = 1.45;
        }

        valorTotal = input * precoUnitario;

        System.out.printf("O valor total da compra é R$ %.2f", valorTotal);

        return valorTotal;
    }
}
