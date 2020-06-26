class Main {
  
  public static void main(String[] args) {

    Editora[] editora = new Editora[1];
      editora[0] = new Editora("Alta Books");

    Autor autor = new Autor("Robert C. Martin");

    Livro livro = FabricaDeLivros.getInstance()
    .novoLivro(
      "Código Limpo: Habilidades Práticas do Agile Software", 
      100, 
      "Computação",
      autor,
      editora);

    MostraLivro mostra = new MostraLivro();

    mostra.mostrar(livro);


    
  }



}