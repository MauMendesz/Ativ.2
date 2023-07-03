import java.util.*;
public class Atividade10
{
    public static void main(String[] args)
    {
        //Variaveis/inicialização
        Scanner ler = new Scanner(System.in);
        int n1, n2, nx = 0;
        //Lógica
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        System.out.println("Digite um segundo número: ");
        n2 = ler.nextInt();
        nx = n1;
        System.out.println("A=" + n1 + " B=" + n2);
        System.out.println("A=" + n2 + " B=" + nx);
    }
}
