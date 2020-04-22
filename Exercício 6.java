/**
Crie um m´etodo est´atico que receba por parˆametro dois vetores. O m´etodo
dever´a juntar os dois vetores afim de montar uma matriz e retonar o resultado.
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    int vetorA[]   = new int[3];
    int vetorB[]   = new int[3];
    int matriz[][] = new int[2][3];

    Random valores = new Random();

    for(int x = 0; x < 3; x++){
      vetorA[x] = (x + 1) * valores.nextInt(10);
      vetorB[x] = (x + 1) * valores.nextInt(10);
    }

    matriz = juntarVetores(vetorA, vetorB);
    
    
    for(int i = 0; i < 2; i++){
      for(int x = 0; x < 2; x++){
        System.out.print(matriz[i][x]);
      }
      System.out.println("");
    }
  }

  public static int[][] juntarVetores(int[] vetorA, int[] vetorB){ 
    int matriz[][] = new int[2][3];
    for(int i = 0; i < 3; i++){
      matriz[0][i] = vetorA[i];
      matriz[1][i] = vetorB[i];
    }

    return matriz;
  }

}
