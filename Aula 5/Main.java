class Main {
  public static void main(String[] args) {
    Produto mouse = new Produto("Deathadder Elite Chroma", 488.78);
    Produto teclado = new Produto("Blackwidow Chroma V2", 1219.90);
    Produto monitor = new Produto("Alienware AW2518HF-Free-Sync, 24.5", 2819);


    System.out.println(mouse.toString());
    System.out.println(teclado.toString());
    System.out.println(monitor.toString());


    //Verificando Valores par a classe equals
    System.out.println("mouse == teclado | "+ mouse.equals(teclado));
    System.out.println("teclado == monitor | " + teclado.equals(monitor));
    System.out.println("monitor == mouse | " + monitor.equals(mouse));
    System.out.println("mouse == mouse | " + mouse.equals(mouse));
    System.out.println("teclado == teclado | " + teclado.equals(teclado));
    System.out.println("monitor == monitor | " + monitor.equals(monitor));
  }
}