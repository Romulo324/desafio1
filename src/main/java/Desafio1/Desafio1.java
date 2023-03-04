package Desafio1;

import java.util.Scanner;

public class Desafio1 {

    public static Scanner imput = new Scanner(System.in);

    static String[] telefones = new String[20];
    static String[] nomes = new String[20];

    static int posicao = 0;
    public static void cadastrarContato(String nome,String telefone) {

        nomes[posicao] = nome;
        telefones[posicao] = telefone;
    }
    //aqui é o menu
    public static void menu(){
        System.out.println("menu");
        System.out.println("1 = cadastrar contato:");
        System.out.println("2 = excluir contato:");
        System.out.println("3 = listar todos os contatos:");
        System.out.println("4 = limpar a linha de contatos:");
        System.out.println("99-sair:");
    }
    //descobrir o indice de quem quero excluir
    public static void excluircontatos(String nome){
        for (int i = 0; i < nomes.length; i++) {
            if (nome.equals(nomes[i])){
                nomes[i] = null;
                telefones[i] = null;
            }
        }
    }
    //listar contatos
    public static void listarcontatos(){
        System.out.println("sua lista de contatos:");
        for (int i = 0; i < nomes.length ; i++) {

            if (nomes[i] != null) {
                String contatos = " nome do contato: " + nomes[i] + " telefone do contato: " + telefones[i];
                System.out.println(contatos);
            }
        }
    }
    //limpar  a lista dos contatos
    public static void limparlistadecontatos(){
        System.out.println("lista de contatos excluida");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null ) {
                nomes[i] = null;
                telefones[i] = null;
                posicao--;
            }

        }
    }

    public static void main(String[] args) {

        String nome, telefone;

        int cont;

        int opcoes;
        do {
            menu();

            opcoes = imput.nextInt();

            switch (opcoes){

                case 1:
                    imput.nextLine();
                    System.out.println("opção 1 selecionada");
                    System.out.println("digite seu nome:");
                    nome = imput.nextLine();
                    System.out.println("digite seu telefone:");
                    telefone = imput.nextLine();
                    cadastrarContato(nome, telefone);
                    posicao++;
                    break;
                case 2:
                    imput.nextLine();
                    System.out.println("excluir contanto");
                    excluircontatos(imput.nextLine());

                    break;
                case 3:
                    listarcontatos();
                    break;
                case 4:
                    limparlistadecontatos();
                    break;
                case 99:
                    System.out.println("programa finalizado");
                    break;
                default:
                    System.out.println("opção invalida");

            }

        }while (opcoes != 99);

        imput.close();



    }



}
