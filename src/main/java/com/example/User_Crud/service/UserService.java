package com.example.User_Crud.service;

import com.example.User_Crud.dto.UserDto;
import com.example.User_Crud.entity.User;
import com.example.User_Crud.repo.UserRepostory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepostory userRepostory;
    @Autowired
    private ModelMapper modelMapper;
    public void saveUser(UserDto userDto){
        if(userRepostory.existsById(userDto.getUid())) throw new RuntimeException("Alrady Exsist");
        userRepostory.save(modelMapper.map(userDto, User.class));
    }

    public void deleteUser(String id){
        if(!userRepostory.existsById(id)) throw new RuntimeException("Cant FInd Exsist");
        userRepostory.deleteById(id);
    }
}
