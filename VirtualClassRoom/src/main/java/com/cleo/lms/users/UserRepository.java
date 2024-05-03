package com.cleo.lms.users;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {


    @Cacheable("Person")
    User findByUsername(String username);
    User getById(Long id);
}
