package Basics;

import java.util.ArrayList;

public class ArrayLists {
  
  public static void main(String[] args) {

    ArrayList<String> heroesOfWorldOfWarcraft = new ArrayList<>();

    heroesOfWorldOfWarcraft.add("Varian");
    heroesOfWorldOfWarcraft.add("Jaina");
    heroesOfWorldOfWarcraft.add("Uther");
    heroesOfWorldOfWarcraft.add("Anduin");
    heroesOfWorldOfWarcraft.add("Arthas");

    System.out.println("La lista de héroes encontrados en WoW es de " + heroesOfWorldOfWarcraft.size());
    System.out.println("El héroe número 3 es " + heroesOfWorldOfWarcraft.get(2));
    System.out.println("El héroe número 1 es " + heroesOfWorldOfWarcraft.set(0, "Lo'Gosh'"));

    heroesOfWorldOfWarcraft.remove("Arthas");

    System.out.println("Los verdaderos héroes de la Alianza son " + heroesOfWorldOfWarcraft);
    System.out.println("Anduin está en la posición número " + (heroesOfWorldOfWarcraft.indexOf("Anduin") + 1));
  }
  
}
