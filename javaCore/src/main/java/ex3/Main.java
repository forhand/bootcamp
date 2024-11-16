package ex3;

public class Main {
  public static void main(String[] args) {
    Character archer = new Archer();
    Character warrior = new Warrior();

    warrior.attack(archer);
    archer.attack(warrior);
    System.out.println(warrior.getHealth());
    System.out.println(archer.getHealth());
  }
}
