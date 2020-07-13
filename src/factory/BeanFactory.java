package factory;

/**
 * @author zhou mingxin
 * @since 2020/7/13
 **/
public class BeanFactory {

    public static UserService getUserService(){
        UserService userService = null;
        try {
            //通过反射解耦
            Class clazz = Class.forName("factory.UserService");
            userService = (UserService) clazz.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return userService;
    }

}
