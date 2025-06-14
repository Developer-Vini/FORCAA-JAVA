import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String palavraSecreta = "banana";

        char[] letras = palavraSecreta.toCharArray();

        char[] progresso = new char[palavraSecreta.length()];

        for (int i = 0; i < progresso.length; i++) {

            progresso[i] = '_';

        }


        int tentativasRestantes = 6;

        boolean ganhou = false;


        System.out.println("Bem-vindo ao Jogo da Forca!");

        System.out.println("Adivinhe a palavra:");


        while (tentativasRestantes > 0 && !ganhou) {

            for (char c : progresso) {

                System.out.print(c + " ");

            }

            System.out.println();

            System.out.println("Tentativas restantes: " + tentativasRestantes);

            System.out.print("Digite uma letra: ");

            char palpite = scanner.next().toLowerCase().charAt(0);


            boolean acertou = false;


            for (int i = 0; i < letras.length; i++) {

                if (letras[i] == palpite && progresso[i] == '_') {

                    progresso[i] = palpite;

                    acertou = true;

                }

            }


            if (!acertou) {

                tentativasRestantes--;

                System.out.println("Letra incorreta!");

            } else {

                System.out.println("Letra correta!");

            }


            ganhou = true;

            for (char c : progresso) {

                if (c == '_') {

                    ganhou = false;

                    break;

                }

            }

        }


        if (ganhou) {

            System.out.println();

            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);

        } else {

            System.out.println();

            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);

        }


        scanner.close();

    }

}
