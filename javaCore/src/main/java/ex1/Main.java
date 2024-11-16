package ex1;

import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    List<User> users = List.of(
            new User("user1", 20, "work1", "address1"),
            new User("user2", 21, "work2", "address2"),
            new User("user3", 22, "work3", "address3"),
            new User("user4", 21, "work4", "address4"),
            new User("user5", 20, "work5", "address5"));

    showGroupUsers(User.groupUsers(users));
  }

  private static void showGroupUsers(Map<Integer, List<User>> groupUsers) {
    for (Map.Entry<Integer, List<User>> e : groupUsers.entrySet()) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
      System.out.println();
    }
  }


}
