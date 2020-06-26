public class MostraLivro{

  public void mostrar(Livro livro){
    System.out.println("============================");
    System.out.println("= Nome:   = "  + livro.getNome());
    System.out.println("= Valor   = "  + livro.getValor());
    System.out.println("= Genero  = " + livro.getGenero());
    System.out.println("= Autor   = "   +  livro.getAutor());
    for(Editora editora: livro.getEditora()){
      System.out.println("= Editora = "   +  editora); 
    }
       
    System.out.println("============================");
  }
}