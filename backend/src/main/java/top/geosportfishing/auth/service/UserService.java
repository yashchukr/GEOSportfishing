package top.geosportfishing.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import top.geosportfishing.auth.model.Role;
import top.geosportfishing.auth.model.User;
import top.geosportfishing.auth.repository.RoleRepository;
import top.geosportfishing.auth.repository.UserRepository;

import java.util.HashSet;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
        //user.setPassword(user.getPassword());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);

    }



}
