import java.util.*;
public class Atividade9
{
    public static void main(String[] args)
    {
        //Variaveis/inicialização
        Scanner ler = new Scanner(System.in);
        String nome, rua, cidade, estado, ncasa, cep, cpf, telefone;
        //Lógica
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine().toUpperCase();
        System.out.println("Digite o seu estado: ");
        estado = ler.nextLine().toUpperCase();
        System.out.println("Digite a sua cidade: ");
        cidade = ler.nextLine().toUpperCase();
        System.out.println("Digite a sua rua: ");
        rua = ler.nextLine().toUpperCase();
        System.out.println("Digite o número da casa: ");
        ncasa = ler.nextLine();
        System.out.println("Digite o cep: ");
        cep = ler.nextLine();
        System.out.println("Digite o cpf: ");
        cpf = ler.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = ler.nextLine();
        System.out.println("Nome..........: " + nome);
        System.out.println("Endereço......: RUA" + rua + ", NÚMERO: " + ncasa + ",CEP: " + cep);
        System.out.println("Cidade........: " + cidade);
        System.out.println("Estdado.......: " + estado);
        System.out.println("CPF...........: " + cpf);
        System.out.println("Tel. Celular..: " + telefone);
    }
}
