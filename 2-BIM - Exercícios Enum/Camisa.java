public class Camisa{

  private Marca marca;
  private double valor;
  private String cor;
  private Tamanhos tamanho;

  public Camisa(Marca marca, double valor, String cor, Tamanhos tamanho ){
    this.marca = marca;
    this.valor = valor;
    this.cor = cor;
    this.tamanho = tamanho;
  }

  public Marca getMarca(){
    return marca;
  }

  public double getValor(){
    return valor;
  }

  public String getCor(){
    return cor;
  }

  public Tamanhos getTamanho(){
    return tamanho;
  }

  @Override

  public String toString(){
    return "Camisa[marca=" + marca +", valor=" + valor + ", cor=" + cor + ", tamanho=" + tamanho + "]";
  }
  
}