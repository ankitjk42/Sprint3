package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Items;

public interface ItemsRepo  extends JpaRepository<Items, Integer>{

}
