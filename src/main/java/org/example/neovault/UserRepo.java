package org.example.neovault;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<Users, Long> {

    // Custom query to find users by their name
    @Query("SELECT u FROM Users u WHERE u.name = :name")
    List<Users> findByName(@Param("name") String name);
}