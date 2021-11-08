/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Marshaller.UnmarshallerService;
import Model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author looby
 */
public class UserRepository {
    private static ArrayList<User> userList = new ArrayList<>();
    private static final UnmarshallerService unmarshaller = new UnmarshallerService();
    
    public static void initialData() {
        userList = unmarshaller.unmarshallerUser();
    }
    public static boolean checkLogin(String username, String password) {
        boolean result = false;
        userList = unmarshaller.unmarshallerUser();
        for (User user : userList) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password) && user.getRole() == 0) {
                result = true;
            }
        }
        return result;
    }

    public static List<User> read() {
        return UserRepository.userList;
    }
}
