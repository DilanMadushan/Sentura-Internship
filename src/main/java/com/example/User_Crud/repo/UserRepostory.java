package com.example.User_Crud.repo;

import com.example.User_Crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostory extends JpaRepository<User,String> {
}
