
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = userService.getUserByLogin("Paul");
        System.out.println("User found: " + user.login + " " + user.email);




    }

    }
