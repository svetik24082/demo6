package com.example.demo_6.repository;

import com.example.demo_6.model.PersonDog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
/**
 * Interface PersonDogRepository.   *
 */
@Repository
public interface PersonDogRepository extends JpaRepository<PersonDog, Long> {
    Set<PersonDog> findByChatId(Long chatId);
}
