package ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    File file = new File("src\\main\\java\\ex2\\data.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      while (br.ready()) {
        String lineUser = br.readLine();
        try {
          User user = parseUser(lineUser);
          System.out.println(user);
        } catch (IllegalArgumentException e) {
          System.out.println(lineUser + ": " + e.getMessage());
        }
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static User parseUser(String lineUser) {
    String[] el = lineUser.split(";");
    if (el[0].equals("null")) {
      el[0] = null;
    }
    return new User(el[0], Integer.parseInt(el[1]), el[2], el[3]);
  }


}
