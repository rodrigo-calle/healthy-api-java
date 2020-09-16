package com.upc.autentication.business;


import com.upc.autentication.entities.Preferences;
import com.upc.autentication.entities.User;
import com.upc.autentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessUser {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        return (List<User>)userRepository.findAll();
    }

    public User login(User user){
        List<User> listUsers = userRepository.login(user.getEmail(), user.getPassword());

        if(listUsers.size() == 0)
            return new User();

        return listUsers.get(0);
    }

}
