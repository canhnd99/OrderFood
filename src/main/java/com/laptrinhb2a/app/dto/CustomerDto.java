package com.laptrinhb2a.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long id;
    private String code;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNo;
    public CustomerDto(String code, String firstName, String lastName,
                       String email, String address, String phoneNo){
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }
}
