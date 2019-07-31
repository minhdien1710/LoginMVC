package com.dao;
import com.model.Login;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setAge(10);
        user1.setName("John");
        user1.setAccount("john");
        user1.setEmail("tranvanJohn@adc.com");
        user1.setPassword("123456");
        users.add(user1);
    }

    public static User checkLogin(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount())
                && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
