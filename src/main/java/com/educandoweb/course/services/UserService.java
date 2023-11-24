package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found."));
    }

    public User insert(User entity){
       return repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User user){
        User reference = repository.getReferenceById(id); //so trás o objeto e monitora, só depois que faz ação
        reference.setName(user.getName());
        reference.setEmail(user.getEmail());
        reference.setPhone(user.getPhone());
        return repository.save(reference);
    }
}
