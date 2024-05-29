package com.fish.anr_seafoods_erp.services;

import com.fish.anr_seafoods_erp.dto.request.CreateUserRequest;
import com.fish.anr_seafoods_erp.entity.Users;

public interface UserService {

    Users createUser(CreateUserRequest createUserRequest);
}
