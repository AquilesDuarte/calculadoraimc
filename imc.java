import java.util.Scanner;

public class imc {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);


        double altura;
        double peso;


        System.out.println("Digite sua altura em M:");
        altura = scan.nextDouble();

        System.out.println("Digite o seu peso em 'KG':");
        peso = scan.nextDouble();

        double  imc = peso / (altura*altura);

        System.out.println("Seu imc eh " + imc);


        if (imc < 18.5) {
            System.out.println("Voce ta muito maguelo");
        } else if(imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc < 39.9) {
            System.out.println("Obesidade");
        } else if (imc >= 40) {
            System.out.println("Obesidade grave");
        }


    }
}