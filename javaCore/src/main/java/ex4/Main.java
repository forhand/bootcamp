package ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
  private static final String DELIMiTER_FIELDS = ";";
  private static final String DELIMITER_HOBBIES = ",";

  public static void main(String[] args) {
    File file = new File("src\\main\\java\\ex4\\data.txt");
    List<User> users = parseFileToUsers(file);
    Set<String> hobbies = Set.of("hob3", "hob8");

    Map<User, String> mapUsersHob = findHobbyLovers(users, hobbies);
    showMapUsers(mapUsersHob);
  }

  public static Map<User, String> findHobbyLovers(List<User> users, Set<String> hobbies){
    Map<User, String> res = new HashMap<>();

    for (User user : users) {

      for (String hobby : hobbies) {

        if(user.getHobbies().contains(hobby)){
          res.put(user, hobby);
          break;
        }
      }
    }
    return res;
  }

  private static void showMapUsers(Map<User, String> mapUsersHob) {
    for (Map.Entry<User, String> e : mapUsersHob.entrySet()) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
      System.out.println();
    }
  }

  private static List<User> parseFileToUsers(File file) {
    List<User> res = new ArrayList<>();

    try(BufferedReader br = new BufferedReader(new FileReader(file))) {

      while (br.ready()){
        String lineUser = br.readLine();
        res.add(parseLineTouser(lineUser));
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return res;
  }

  private static User parseLineTouser(String lineUser) {
    String[] els = lineUser.split(DELIMiTER_FIELDS);
    Set<String> hobbies = Set.of(els[els.length-1].split(DELIMITER_HOBBIES));
    return new User(Integer.parseInt(els[0]), els[1], Integer.parseInt(els[2]), hobbies);
  }



}
