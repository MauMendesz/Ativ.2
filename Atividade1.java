import java.util.*;
public class Atividade1
{
    public static void main(String[] args)
    {
        //Variaveis/inicialização
        Scanner ler = new Scanner(System.in);
        String Nome, Cidade;
        //Lógica
        System.out.println("Digite seu nome: ");
        Nome = ler.nextLine().toUpperCase();
        System.out.println("Digite sua cidade: ");
        Cidade = ler.nextLine().toUpperCase();
        System.out.println("Olá " + Nome + ",Você mora na cidade de " + Cidade);
    }
}
