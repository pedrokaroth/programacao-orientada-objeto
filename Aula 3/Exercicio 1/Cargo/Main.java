class Main {
  public static void main(String[] args) {
    Cargo cargo = new Cargo();

    cargo.setNome("Programador");
    cargo.setDescricao("Programador JAVA");
    cargo.setPisoSalarial(10000);
    cargo.setCargaHoraria(6);
    System.out.println("Nome: " + cargo.getNome());
    System.out.println("Descricao: " + cargo.getDescricao());
    System.out.println("Piso Salarial: " + cargo.getPisoSalarial());
    System.out.println("Carga Horaria: " + cargo.getCargaHoraria());
  }
}