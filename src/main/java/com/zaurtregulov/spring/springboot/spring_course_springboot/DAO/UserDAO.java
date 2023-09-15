package com.zaurtregulov.spring.springboot.spring_course_springboot.DAO;



import com.zaurtregulov.spring.springboot.spring_course_springboot.entity.User;

import java.util.List;


public interface UserDAO {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);
}