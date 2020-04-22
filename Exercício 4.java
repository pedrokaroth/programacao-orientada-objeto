/**
Crie um m´etodo est´atico que receba por parˆametro uma matriz de n´umeros
inteiros e imprima em tela o seu conte´udo.
*/

class Main {
  public static void main(String[] args) {
    int matriz[][] = new int[3][3];
    
    for(int i = 0; i < 3; i++){
      for(int x = 0; x < 3; x++){
        matriz[i][x] = i * x;
      }
    }

    exibeMatriz(matriz);
  }

  public static void exibeMatriz(int[][] matriz) {
    for(int i = 0; i < 3; i++){
      for(int x = 0; x < 3; x++){
        System.out.println(matriz[i][x]);
      }
    }
  }
}
