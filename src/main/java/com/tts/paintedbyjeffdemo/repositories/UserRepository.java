package com.tts.paintedbyjeffdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.paintedbyjeffdemo.models.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
