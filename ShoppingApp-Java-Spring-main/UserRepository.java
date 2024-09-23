package com.Project.Project.repository;


    import com.Project.Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {}

