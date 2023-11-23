package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Order not found."));

    }
}
