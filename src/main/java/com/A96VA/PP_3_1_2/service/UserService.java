package com.A96VA.PP_3_1_2.service;

import com.A96VA.PP_3_1_2.models.User;
//import web.models.User;

import java.util.List;

public interface UserService {
    User show(int id);                       //вывод одного

    List<User> countUsers(int count);        // вывод всех или несколько

    void save(User user);                    // добавление

    User update(int id, User updateUser);   // изменение

    void delete(int id);                     // удаление
}
