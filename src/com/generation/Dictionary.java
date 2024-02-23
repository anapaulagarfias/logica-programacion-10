package com.generation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    HashMap<String, String> dictionary = new HashMap<>();

    dictionary.put("caminar", "Walk");
    dictionary.put("enseñar", "Teach");
    dictionary.put("telefono", "Cell-phone");
    dictionary.put("botella", "Bottle");
    dictionary.put("pajaro", "Bird");
    dictionary.put("mascota", "Pet");
    dictionary.put("silla", "Chair");
    dictionary.put("novio", "Boyfriend");
    dictionary.put("tio", "Uncle");
    dictionary.put("tia", "Aunt");
    dictionary.put("mama", "Mom");
    dictionary.put("piso", "Floor");
    dictionary.put("cafe", "Coffee");
    dictionary.put("rosa", "Pink");
    dictionary.put("chamarra", "Jacket");
    dictionary.put("oso", "Bear");
    dictionary.put("sonrisa", "Smile");
    dictionary.put("primo", "Cousin");
    dictionary.put("hija", "Daughter");
    dictionary.put("papa", "Dad");
    dictionary.put("camiseta", "T-shirt");
    dictionary.put("escritorio", "Desk");

    List<String> listKey = new ArrayList<>(dictionary.keySet());
    int count = 0;
    int numberQuestions = 5;
    for (int i = numberQuestions; i >= 1; i--) {
      String englishWord = listKey.get(new Random().nextInt(20));
      System.out.println(
        "Ingresa la traducción del español de la siguiente palabra: " +
        englishWord
      );
      String spanishWord = in.nextLine();
      if (
        spanishWord
          .toUpperCase()
          .equals(dictionary.get(englishWord).toUpperCase())
      ) {
        count++;
      }
    }
    System.out.println(
      "Respuestas correctas: " +
      count +
      " | Respuestas incorrectas: " +
      (count - numberQuestions) +
      " | " +
      "De un total de preguntas: " +
      numberQuestions
    );

    in.close();
  }
}