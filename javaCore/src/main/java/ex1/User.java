package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
  private String name;
  private int age;
  private String work;
  private String address;

  public User(String name, int age, String work, String address) {
    this.name = name;
    this.age = age;
    this.work = work;
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "User{name=%s, age:%d}".formatted(name, age);
  }

  public static Map<Integer, List<User>> groupUsers (List<User> users){
    Map<Integer, List<User>> result = new HashMap<>();

    for (User user : users) {
      int age = user.getAge();
      if(!result.containsKey(age)){
        result.put(age, new ArrayList<>());
      }
      result.get(age).add(user);
    }
    return result;
  }

}
