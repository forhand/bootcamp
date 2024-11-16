package ex3;

public class Warrior extends Character {
  protected static int STRAIGHT = 10;
  protected static int AGILITY = 5;
  protected static int INTELLIGENT  = 3;

  public Warrior() {
    super(STRAIGHT, AGILITY, INTELLIGENT);
  }

  @Override
  public void attack(Character enemy) {
    enemy.setHealth(enemy.getHealth() - STRAIGHT);
  }
}
