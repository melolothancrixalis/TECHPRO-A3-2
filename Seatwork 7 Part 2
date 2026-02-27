class PasswordException extends Exception {
  public PasswordException(String message) {
    super(message);
  }
}

public class Seatwork7 {

  static voic checkPassword(String password) throws PassowrdException {
    if (password.length()) {
      throw new PassordException("Password must contain 8 or above");
    } else {
    System.out.println("Password Accepted");
    }
  }

  public static void main(String[] args) {
    try {
       checkPassword("Password1234");
    } catch (PasswordException e) {
       System.out.println("User-Defined Exception: " + e.getMessage());
    }
  }
}
