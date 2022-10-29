import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
  double numUser, numMaq = 28;

    System.out.println("Digite o número que você acha que foi escolhido pela máquina: ");
    numUser = sc1.nextDouble();

    System.out.println("Você escolheu o número: " + numUser + " e a máquina escolheu o número: " + numMaq);
  }
}