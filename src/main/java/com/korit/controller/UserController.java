package com.korit.controller;

import com.korit.entity.User;
import com.korit.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class UserController {

    @Setter
    private UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    public void signIn() { // 위의 코드로 인해, Controller 가 생성되면 userService 가 생성되기 때문에 () 내부 생략 가능
                            // >> 외부에서 의존성 주입!
    }

    public void signUp() {
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";
        User user = User.builder()
                .username(username)
                .username(password)
                .username(email)
                .build();
        userService.add(user);
    }
}
