package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
