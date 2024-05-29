package com.fish.anr_seafoods_erp.services.Impl;

import com.fish.anr_seafoods_erp.dto.request.CreateUserRequest;
import com.fish.anr_seafoods_erp.entity.Users;
import com.fish.anr_seafoods_erp.repository.UserRepository;
import com.fish.anr_seafoods_erp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users createUser(CreateUserRequest createUserRequest) {
        return userRepository.save(mapToUserEntity(createUserRequest));
    }

    private Users mapToUserEntity(CreateUserRequest createUserRequest){

        Users newUser=new Users();
        newUser.setAddress(createUserRequest.getAddress());
        newUser.setAge(createUserRequest.getAge());
        newUser.setEmail(createUserRequest.getEmail());
        newUser.setName(createUserRequest.getName());
        newUser.setPhoneNo(createUserRequest.getPhoneNo());
        newUser.setRole(createUserRequest.getRole());
        return newUser;
    }
}
