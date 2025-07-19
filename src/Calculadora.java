import java.util.Scanner;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por 0");
            return 0;
        } else {
            return a / b;
        }

    }

    public double restoDivisao(double a, double b) {
        return a % b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========CALCULADORA=======");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcao){
            case 1:
                System.out.println("Resultado da Soma: " + somar(num1 , num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + subtrair(num1,num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("Resultado da Divisão: " + dividir(num1,num2));
                break;
            default:
                System.out.println("Opção Invalida!!");
        } scanner.close();
    }

    public static void main(String[] args){
        Calculadora calculadora =  new Calculadora();
        calculadora.exibirMenu();
    }


}