package factory;

/**
 * @author zhou mingxin
 * @since 2020/7/13
 **/
public class Main {
    public static void main(String[] args) {
        UserService userService = BeanFactory.getUserService();
        userService.login("zmx", "pwd");
    }
}
