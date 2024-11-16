package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
  private static Set<String> VALID_JOBS = Set.of("Google", "Uber", "Amazon");
  private static Set<String> VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");
  private String name;
  private int age;
  private String work;
  private String address;

  public User(String name, int age, String work, String address) {
    if (name == null || age < 18 || !VALID_JOBS.contains(work) || !VALID_ADDRESSES.contains(address)) {
      throw new IllegalArgumentException("Некорректные данные");
    }
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
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", work='" + work + '\'' +
            ", address='" + address + '\'' +
            '}';
  }

  public static Map<Integer, List<User>> groupUsers(List<User> users) {
    Map<Integer, List<User>> result = new HashMap<>();

    for (User user : users) {
      int age = user.getAge();
      if (!result.containsKey(age)) {
        result.put(age, new ArrayList<>());
      }
      result.get(age).add(user);
    }
    return result;
  }

}
