package exercicio5;

import java.util.Scanner;

import exercicio2.Cachorro;
import exercicio2.Gato;

/**
 * Classe que permite ao usu�rio escolher um animal, definir as caracter�sticas
 * e mostra como este animal caminha e fala.
 * 
 * Main
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 * 
 */
public class ExercicioDoisView {
  public static void main(String[] args) {
    Gato cat = new Gato(" ", " ");
    Cachorro dog = new Cachorro(" ", " ");
    Scanner ler = new Scanner(System.in);
    String animal;

    System.out.println("Qual o seu animal favorito?, Gato ou Cachorro?");
    animal = ler.next();

    if (animal.equals("Gato")) {
      try {
        cat.inserirGato();
      } catch (Exception e) {
        System.out.println(e.getMessage());
        ler.close();
        return;
      } finally {
        System.out.println("Nenhum erro encontrado");
      }
    } else if (animal.equals("Cachorro")) {
      try {
        dog.inserirCachorro();
      } catch (Exception e) {
        System.out.println(e.getMessage());
        ler.close();
        return;
      }
    }
    ler.close();
  }
}
