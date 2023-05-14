package com.example.demo_6.repository;

import com.example.demo_6.model.PersonCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonCatRepository extends JpaRepository<PersonCat, Long> {

    Set<PersonCat> findByChatId(Long chatId);
}
