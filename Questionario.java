import java.io.*;
public class Questionario

{
    public static void main(String args[]){
        String Nome = Teclado.leString ("Digite o seu nome: ");
        String Telefone= Teclado.leString("Numero para Contato: ");
        String Email= Teclado.leString("Digite seu e-mail para contato: ");
        int Idade = Teclado.leInt("qual a sua idade? ");
        char Cnh = Teclado.leChar("Digite o numero de sua CNH: ");
        String Cpf = Teclado.leString("Digite o seu CPF: ");
        String Rg = Teclado.leString("Digite o seu RG: ");
        String Estado = Teclado.leString("Estado de nascimento: ");
        String Cidade = Teclado.leString("Cidade de nascimento: ");       
        String Endereco = Teclado.leString ("Digite o seu atual endereço: ");
        String Questio = ("----------------Resumo Do Questionario ------------------");
        String Fim = ("--------------------Questionario Finalizado------------------");
        
        System.out.println(Questio);
        System.out.println("Nome:" +Nome);
        System.out.println("Telefone:"+Telefone);
        System.out.println("Email:"+Email);
        System.out.println("Idade:"+Idade);
        System.out.println("CNH:"+Cnh);
        System.out.println("CPF:"+Cpf);
        System.out.println("RG:"+Rg);
        System.out.println("Estado:"+Estado);
        System.out.println("Cidade:"+Cidade);
        System.out.println("Endereço:"+Endereco);
        System.out.println(Fim);}
        
    }
        
        

        