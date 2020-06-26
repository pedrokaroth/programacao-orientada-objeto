public class FabricaDeLivros{

  private static FabricaDeLivros instance;

  private FabricaDeLivros() {}

  public static synchronized FabricaDeLivros getInstance(){
    if(instance == null){
      instance = new FabricaDeLivros();
    }

    return instance;
  }

  public Livro novoLivro(String nome, double valor, String genero, Autor autor, Editora[] editora){
    return new Livro(nome, valor, genero, autor, editora);
  }
  
}