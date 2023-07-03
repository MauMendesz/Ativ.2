import java.util.*;
public class Atividade2
{
    public static void main(String[] args)
    {
        //Variaveis/inicialização
        Scanner ler = new Scanner(System.in);
        String nome;
        //Lógica
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Olá " + nome + ", Sejá bem vindo");
    }
}
