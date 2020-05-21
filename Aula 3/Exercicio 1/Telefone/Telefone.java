public class Telefone {
  private String nome;
  private int valor;
  private String marca;
  private String operadora;

  public String getNome(){
    return nome;
  }

  public int getValor(){
    return valor;
  }

  public String getMarca(){
    return marca;
  }

  public String getOperadora(){
    return operadora;
  }

  public void setNome(String novoNome){
    nome = novoNome;
  }

  public void setValor(int novoValor){
    valor = novoValor;
  }

  public void setMarca(String novaMarca){
    marca = novaMarca;
  }

  public void setOperadora(String novaOperadora){
    operadora = novaOperadora;
  }
}