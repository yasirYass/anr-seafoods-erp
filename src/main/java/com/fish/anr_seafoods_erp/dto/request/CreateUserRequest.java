package com.fish.anr_seafoods_erp.dto.request;

import com.fish.anr_seafoods_erp.constants.ErrorResponseConstants;
import com.fish.anr_seafoods_erp.constants.RegexConstants;
import com.fish.anr_seafoods_erp.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



public class CreateUserRequest {

    private Short age;


    private UserRole role;


    private String name;

    private String address;


    @NotBlank(message =ErrorResponseConstants.phoneNoRequired)
    @Pattern(regexp = RegexConstants.phoneRegex, message = ErrorResponseConstants.phoneNoValidationError)
    private String phoneNo;

    @NotNull(message = ErrorResponseConstants.emailRequired)
    @Email(regexp = RegexConstants.emailRegex, message = ErrorResponseConstants.emailValidationError)
    private String email;

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
