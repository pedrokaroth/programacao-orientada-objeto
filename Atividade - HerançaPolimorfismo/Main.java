import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    java.util.Scanner read = new Scanner(System.in);
    Cubic cubic = new Cubic(); 
    Quadratic quadratic = new Quadratic();
    

    int menu, countAn, reset;
    boolean loop;


    do{
      System.out.println("+-------------------------+");
      System.out.println("+  GERADOR DE SEQUENCIA   +");
      System.out.println("+-------+-----------------+");
      System.out.println("+   0   |      Cúbicas    +");    
      System.out.println("+   1   |    Quadráticas  +");    
      System.out.println("+   2   |       Sair      +");     
      System.out.println("+-------+-----------------+");

      menu = read.nextInt();

      switch (menu){

        case 0:
          System.out.print("Primeiro valor: ");
          cubic.setA1(read.nextInt());
          countAn = 1;
          cubic.setAn(countAn);

          System.out.println("+-------------------------+");
          System.out.println("+     VALORES GERADOS     +");
          System.out.println("+-------------------------+");
          cubic.currentNumber();
          cubic.nextNumber();
          cubic.countNumber();

          loop = true;
          do {
            System.out.println("+-------------------------+");
            System.out.println("+  GERADOR DE SEQUENCIA   +");
            System.out.println("+-------+-----------------+");
            System.out.println("+   0   |     Adicionar   +");    
            System.out.println("+   1   |     Reiniciar   +");    
            System.out.println("+   2   |       Sair      +");     
            System.out.println("+-------+-----------------+");
            reset = read.nextInt();

            if(reset == 0){

            System.out.println("+-------------------------+");
            System.out.println("+     VALORES GERADOS     +");
            System.out.println("+-------------------------+");
              countAn++;
              cubic.setAn(countAn);
              cubic.currentNumber();
              cubic.nextNumber();
              cubic.countNumber();

            }else if (reset == 1){
              cubic.reset();
              countAn = 1;
              cubic.setAn(1);
              cubic.currentNumber();
              cubic.nextNumber();
              cubic.countNumber();
            } else{
              loop = false;
            }
          } while(loop);

          break;

        case 1:
          System.out.print("Primeiro valor: ");
          quadratic.setA1(read.nextInt());
          countAn = 1;
          quadratic.setAn(countAn);

          System.out.println("+-------------------------+");
          System.out.println("+     VALORES GERADOS     +");
          System.out.println("+-------------------------+");
          quadratic.currentNumber();
          quadratic.nextNumber();
          quadratic.countNumber();

          loop = true;
          do {
            System.out.println("+-------------------------+");
            System.out.println("+  GERADOR DE SEQUENCIA   +");
            System.out.println("+-------+-----------------+");
            System.out.println("+   0   |     Adicionar   +");    
            System.out.println("+   1   |     Reiniciar   +");    
            System.out.println("+   2   |       Sair      +");     
            System.out.println("+-------+-----------------+");
            reset = read.nextInt();

            if(reset == 0){

            System.out.println("+-------------------------+");
            System.out.println("+     VALORES GERADOS     +");
            System.out.println("+-------------------------+");
              countAn++;
              quadratic.setAn(countAn);
              quadratic.currentNumber();
              quadratic.nextNumber();
              quadratic.countNumber();

            }else if (reset == 1){
              quadratic.reset();
              countAn = 1;
              quadratic.setAn(1);
              quadratic.currentNumber();
              quadratic.nextNumber();
              quadratic.countNumber();
            } else{
              loop = false;
            }
          } while(loop);

          break;          
      }
    }while(menu != 2);

  }
}