package exercicios;

import java.time.LocalDate;

public class Exercicios10 {

        public static void main(String[] args) {

            LocalDate hoje = LocalDate.ofEpochDay(0);
            int anoAtual = hoje.getYear();  // extrai o ano
            int anoDeNascimento = 0;
            int idadeCalculada = anoAtual - anoDeNascimento;
        // imprimindo resultado na tela
            System.out.println("\u001B[33m A idade calculada é: \u001B[0m" + idadeCalculada);
            System.out.println("A idade calculada é: " + idadeCalculada);

    }
}
