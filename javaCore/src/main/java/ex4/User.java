package ex4;

import java.util.Set;

public class User {
  private int id;
  private String name;
  private int age;
  private Set<String> hobbies;

  public User(int id, String name, int age, Set<String> hobbies) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.hobbies = hobbies;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", hobbies=" + hobbies +
            '}';
  }

  public Set<String> getHobbies() {
    return hobbies;
  }
}
