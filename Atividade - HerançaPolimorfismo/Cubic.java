public class Cubic extends Sequence {
  
  @Override
  public void nextNumber(){
    System.out.println("Próximo número: " + a1 * Math.pow( 2 , (an + 1) - 1));
  }

  public void currentNumber(){
    System.out.println("Número atual: " + a1 * Math.pow( 2 , (an - 1)));    
  }

  public void countNumber(){
    System.out.println("Números gerados: " + an);
  }

  public void reset(){
    an = 0;
  }
}