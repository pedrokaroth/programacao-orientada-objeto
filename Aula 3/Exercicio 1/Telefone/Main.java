class Main {
  public static void main(String[] args) {
    Telefone telefone = new Telefone();
    telefone.setNome("Galaxy S9");
    telefone.setValor(2300);
    telefone.setMarca("Samsung");
    telefone.setOperadora("Oi");
    System.out.println("Nome: " + telefone.getNome());
    System.out.println("Valor: " + telefone.getValor());
    System.out.println("Marca: " + telefone.getMarca());
    System.out.println("Operadora: " + telefone.getOperadora());
  }
}