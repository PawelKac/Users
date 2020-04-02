/**
 * Created by Kaczmarczyk on 2020-04-01.
 */
public class UserService {

    User [] users = new User[4]; //my "database" ;)

    public UserService() {
        users[0] = new User("admin", "pass", "mail", 32);
        users[1] = new User("user", "pass", "mail", 62);
        users[2] = new User("Paul", "pass", "mail", 52);
        users[3] = new User("John", "pass", "mail", 21);


    }
    User getUserByLogin(String login) {
        for (User user:users) {
            boolean isSameLogin = user.login.equals(login);
            if (isSameLogin) {
                return user;
            }
        }
        return null;
    }


}
