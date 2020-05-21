public class Pessoa {
  private String nome = "Pedro Afonso Roth Dimbarre";
  private String endereco = "Rua Tijucas";
  private String nomeMae = "Maura";
  private String nomePai = "Celso";
  private int idade = 21;
  private int cep = 89204020;

  public String getNome(){
    return nome;
  }

  public int getIdade(){
    return idade;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setNome(String novoNome){
    nome = novoNome;
    System.out.println("Nome alterado para: "+ novoNome);
  }

  public void setIdade(int novaIdade){
    idade = novaIdade;
    System.out.println("Idade alterada para: "+ novaIdade);
  }

  public void setEndereco(String novoEnde){
    endereco = novoEnde;
    System.out.println("Endereco alterado para: " +novoEnde);
  }
}