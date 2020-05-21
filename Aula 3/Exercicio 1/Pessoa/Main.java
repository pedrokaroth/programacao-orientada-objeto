class Main {
  public static void main(String[] args) {
    Pessoa user = new Pessoa();
    System.out.println("Nome: " + user.getNome());
    System.out.println("Idade: " + user.getIdade());
    System.out.println("Endereço: " + user.getEndereco());
    user.setNome("Matheus Eduardo");
    user.setIdade(13);
    user.setEndereco("Rua florianopolis");  
  }
}