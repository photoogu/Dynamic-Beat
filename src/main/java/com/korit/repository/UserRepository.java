package com.korit.repository;

import com.korit.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository instance;
    private List<User> userList;

    private UserRepository() {          // Repository 는 생성자 생성을 제한해야함.
        userList = new ArrayList<>();
    }

    public static UserRepository getInstance() {
        if (instance == null) {         // 싱글톤!
            instance = new UserRepository();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

}
