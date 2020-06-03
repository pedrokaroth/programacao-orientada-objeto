public class Produto{
  private String nome;
  private double valor;

  public Produto(String nome, double valor){
    this.nome  = nome;
    this.valor = valor;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

  public String getNome(){
    return nome;
  }

  public double getValor(){
    return valor;
  }

  @Override
  public String toString(){
    return "[Produto (nome = " + nome + " valor = " + valor + ")]";
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null)return false;
    
    boolean flag = false;
    if(o instanceof Produto){
      Produto p = (Produto)o;

      if(nome != null){
        flag = nome.equals(p.nome);
      }else{
        flag = p.nome == null;
      }

      flag = (flag && valor == p.valor);

    }return flag;

  }

}