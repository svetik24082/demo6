package com.example.demo_6.repository;

import com.example.demo_6.model.Cat;
import com.example.demo_6.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Интерфейс Cat Repository.
 * @автор Хотенов Василий
 */
@Repository
public interface DogRepository extends JpaRepository <Dog, Long>{
}
