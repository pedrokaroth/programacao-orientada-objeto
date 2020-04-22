/**
Crie um m´etodo est´atico que receba por parˆametro uma quantidade infinita de
parˆametros de n´umeros reais e que calcule e retorne o desvio padr˜ao. Confira
a f´ormula do desvio padr˜ao em https://www.todamateria.com.br/desviopadrao/.

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    String adicionar = "s";
    float valor;
    Scanner pegar = new Scanner(System.in);

    ArrayList<Float> lista = new ArrayList<Float>();


    while(adicionar.equals("s")){
      System.out.println("Digite um valor: ");
      valor = pegar.nextFloat();
      lista.add(valor);
      System.out.println("Deseja continuar adicionando?");
      adicionar = pegar.next();
    }

    desvioPadrao(lista);

  }

  public static void desvioPadrao(ArrayList<Float> lista){
    float soma = 0, media;


    for(Float item : lista){
        soma += item;
    }

    media = soma/lista.size();
    
    soma = 0;
    for(Float item : lista){
        soma += Math.pow((item - media), 2);
    }
    System.out.println(Math.sqrt(soma/lista.size()));
  }
}

