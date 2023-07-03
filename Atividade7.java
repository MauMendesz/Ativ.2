import java.util.*;
public class Atividade7
{
    public static void main(String[] args)
    {
        //Variaveis/inicialização
        Scanner ler = new Scanner(System.in);
        String nome, cidade;
        int idade;
        //Lógica
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Digite sua cidade: ");
        cidade = ler.nextLine().toUpperCase();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos, e mora na cidade de " + cidade);
    }
}
