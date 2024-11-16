package ex3;

public class Archer extends Character{
  protected static int STRAIGHT = 3;
  protected static int AGILITY = 15;
  protected static int INTELLIGENT  = 5;

  public Archer() {
    super(STRAIGHT, AGILITY, INTELLIGENT);
  }

  @Override
  public void attack(Character enemy) {
    enemy.setHealth(enemy.getHealth() - AGILITY);
  }
}
