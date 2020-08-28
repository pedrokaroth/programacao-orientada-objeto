public class Sequence{
  
  protected int a1;
  protected int q;
  protected int an;

  public void setA1(int a1){
    this.a1 = a1;
  }

  public void setQ(int q){
    this.q = q;
  }
  
  public void setAn(int an){
    this.an = an;
  }

  public int getA1(){
    return this.a1;
  }

  public int getQ(){
    return this.q;
  }

  public int getAn(){
    return this.an;
  }

  public void nextNumber(){
    System.out.println("Próximo número");
  }

  public void currentNumber(){
    System.out.println("Número atual");
  }

  public void countNumber(){
    System.out.println("Quantidade de números");
  }

  public void reset(){
    System.out.println("Recomeçar sequência");
  }



}