package com.trybe.acc.java;


/** Verifica o estado da Lâmpada. */
public class Lampada {

  /** Imprime a saída no console. */ 
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    
    Boolean isLigada = true;
    StringBuilder frase = stringBuilder.append("A lampada ligada: ")
                                       .append(isLigada).append("!");

    System.out.println(frase);
    
  }

}
