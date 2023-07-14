import java.util.Scanner;
public class PromoFrutas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] frutasPromocao = { "Pera", "Laranja", "Maçã", "Tomate", "Caqui" };

            System.out.println("Frutas em Promoção: Compre mais de 10 frutas do mesmo tipo por R$1.25 cada. \nFrutas da promoção: pera, laranja, maçã, tomate, caqui.");

            System.out.println("Digite o nome da fruta: ");
            String fruta = scanner.nextLine();

            System.out.println("Digite a quantidade de frutas: ");
            int quantidade = scanner.nextInt();

            double precoUnitario;
            if (isFrutaPromocao(fruta, frutasPromocao) && quantidade > 10) {
                precoUnitario = 1.25;
            } else {
                precoUnitario = 1.45;
            }

            double valorFinal = quantidade * precoUnitario;

            System.out.printf("Valor a pagar: %d %s(s): R$ %.2f", quantidade, fruta, valorFinal);

            scanner.close();
        }

        public static boolean isFrutaPromocao(String fruta, String[] frutasPromocao) {
            for (String frutaPromocao : frutasPromocao) {
                if (frutaPromocao.equalsIgnoreCase(fruta)) {
                    return true;
                }
            }
            return false;
        }

}
