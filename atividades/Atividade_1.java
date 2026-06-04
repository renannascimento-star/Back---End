import java.util.Scanner;

public class Atividade_1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;

        if (media >= 7){
            System.out.println("O ALUNO PASSOU COM MÉDIA: "+ media);
        } else {
            System.out.println("O ALUNO NÃO PASSOU COM MÉDIA");
        }
    }
}
