import java.security.SecureRandom;
import java.util.Scanner;

public class PwGen{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter password length: ");
    int length = scanner.nextInt();
    System.out.println("Password: " + createPw(length));
  }
public static String createPw(int length){
  StringBuilder builder = new StringBuilder();
  SecureRandom rng = new SecureRandom();
  int x = 0;
  while (x < length) {
  	char value = (char)(rng.nextInt(94)+33);
    builder.append(value); 
    x++;
  }
  return builder.toString();
}
}