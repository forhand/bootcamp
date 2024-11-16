package ex3;

public abstract class Character {
  private static final int HEALTH_DEFAULT = 100;
  private int health;
  private int straight;
  private int agility;
  private int intelegent;

  public Character(int straight, int agility, int intelegent) {
    this.health = HEALTH_DEFAULT;
    this.intelegent = intelegent;
    this.agility = agility;
    this.straight = straight;
  }


  public abstract void attack(Character enemy);

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

}
