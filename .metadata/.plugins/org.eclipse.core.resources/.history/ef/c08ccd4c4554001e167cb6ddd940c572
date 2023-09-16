package logic_program;

import java.util.Scanner;

public class Jogador {

	private String nome;
    private Tabuleiro tabuleiro;

    public Jogador(String nome, Tabuleiro tabuleiro) {
        this.nome = nome;
        this.tabuleiro = tabuleiro;
    }

    public String getNome() {
        return nome;
    }

    public void posicionarNavios() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(nome + ", posicione seus navios.");

			for (int i = 0; i < 3; i++) { // Vamos posicionar 3 navios neste exemplo
			    System.out.print("Informe a linha para o navio " + (i + 1) + ": ");
			    int linha = scanner.nextInt();
			    System.out.print("Informe a coluna para o navio " + (i + 1) + ": ");
			    int coluna = scanner.nextInt();

			    tabuleiro.posicionarNavio(linha, coluna);
			}
		}
    }

    public void fazerJogada(Jogador adversario) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(nome + ", é sua vez de atirar.");
			System.out.print("Informe a linha do tiro: ");
	
			int linhaTiro = scanner.nextInt();
			System.out.print("Informe a coluna do tiro: ");
			
			int colunaTiro = scanner.nextInt();
		}

       
    }

    public boolean verificarVitoria() {
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            for (int j = 0; j < tabuleiro.getTamanho(); j++) {
                if (tabuleiro.getTabuleiro()[i][j] == 1) {
                    return false; // Ainda há navios não afundados no tabuleiro
                }
            }
        }
        return true; // Todos os navios do adversário foram afundados
    }

	public void exibirTabuleiro() {
		// TODO Auto-generated method stub
		
	}
}

