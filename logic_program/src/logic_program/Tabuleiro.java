package logic_program;

public class Tabuleiro {

	 private int tamanho;
	    private int[][] tabuleiro; // 0 representa água, 1 representa parte de um navio

	    public Tabuleiro(int tamanho) {
	        this.tamanho = tamanho;
	        this.tabuleiro = new int[tamanho][tamanho];
	        inicializarTabuleiro();
	    }

	    public Tabuleiro(int tamanhoTabuleiro, String string) {
			// TODO Auto-generated constructor stub
		}

		public int getTamanho() {
	        return tamanho;
	    }

	    public void inicializarTabuleiro() {
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                tabuleiro[i][j] = 0; // Inicializa o tabuleiro com água
	            }
	        }
	    }

	    public void posicionarNavio(int x, int y) {
	        if (x < 0 || x >= tamanho || y < 0 || y >= tamanho) {
	            System.out.println("Posição inválida.");
	            return;
	        }

	        if (tabuleiro[x][y] == 0) {
	            tabuleiro[x][y] = 1; // Coloca uma parte do navio na posição
	            System.out.println("Navio posicionado em (" + x + ", " + y + ").");
	        } else {
	            System.out.println("Posição ocupada por outro navio.");
	        }
	    }

	    public boolean atirar(int x, int y) {
	        if (x < 0 || x >= tamanho || y < 0 || y >= tamanho) {
	            System.out.println("Tiro fora do tabuleiro.");
	            return false;
	        }

	        if (tabuleiro[x][y] == 1) {
	            System.out.println("Você acertou um navio!");
	            tabuleiro[x][y] = -1; // Marca a posição como "atingida"
	            return true;
	        } else if (tabuleiro[x][y] == -1) {
	            System.out.println("Você já atirou nesta posição.");
	            return false;
	        } else {
	            System.out.println("Tiro na água.");
	            return false;
	        }
	    }
	    public void exibirTabuleiro() {
	        String nome = null;
			System.out.println("Tabuleiro de " + tamanho + "x" + tamanho + " - " + nome);
	        System.out.print("  ");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < tamanho; i++) {
	            System.out.print(i + " ");
	            for (int j = 0; j < tamanho; j++) {
	                if (tabuleiro[i][j] == 0) {
	                    System.out.print("~ "); // Água
	                } else if (tabuleiro[i][j] == 1) {
	                    System.out.print("O "); // Parte do navio
	                } else if (tabuleiro[i][j] == -1) {
	                    System.out.print("X "); // Parte do navio atingida
	                }
	            }
	            System.out.println();
	        }
	    }

		public int[][] getTabuleiro() {
			// TODO Auto-generated method stub
			return null;
		}


}
