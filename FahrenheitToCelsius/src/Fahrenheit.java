import java.util.Scanner;

public class Fahrenheit {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de temperatura.\n Digite a temperatura em Fahrenheit:");

        double fahrenheit = scan.nextDouble();
        double celsius = 5* ((fahrenheit-32)/9);
        System.out.printf("Temperatura em Celsius é de: %.2f%s",  celsius, " C");
    }
}
