public class Livro{

  private String nome;
  private double valor;
  private String genero;
  private Autor autor;
  private Editora editora[];

  public Livro(String nome, double valor, String genero, Autor autor, Editora editora[]){
    this.nome = nome;
    this.valor = valor;
    this.genero = genero;
    this.autor = autor;
    this.editora = editora;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public double getValor(){
    return valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

  public String getGenero(){
    return genero;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }
  
  public Autor getAutor(){
    return autor;
  }

  public void setAutor(Autor autor){
    this.autor = autor;
  }

  public Editora[] getEditora(){
    return editora;
  }

  public void setEditora(Editora editora[]){
    this.editora = editora;
  }



}