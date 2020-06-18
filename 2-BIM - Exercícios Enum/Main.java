public class Main {
  public static void main(String[] args) {
    Meses mes = Meses.MAIO;

    System.out.println("Mês: " + mes);

    Camisa camisaA = new Camisa(
      Marca.NIKE,
      90.00,
      "Branca",
      Tamanhos.P
    );
    Camisa camisaB = new Camisa(
      Marca.ADIDAS,
      159.90,
      "Preta",
      Tamanhos.M
    );
    Camisa camisaC = new Camisa(
      Marca.GUCCI,
      1350,
      "Azul marinho",
      Tamanhos.G
    );

    System.out.println(camisaA);
    System.out.println(camisaB);
    System.out.println(camisaC);

  }
}