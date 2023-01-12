package general;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public void setUserData() throws FileNotFoundException {
        File file = new File("F:\\anibiotik\\Password\\Rozetka.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] user = line.split(" ");
        this.login = user[0];
        this.password = user[1];
        scanner.close();

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
