package com.laptrinhb2a.app.converter;

import com.laptrinhb2a.app.dto.AdminDetails;
import com.laptrinhb2a.app.entity.AdminEntity;

public class EntityToAdminDetails {
    public static AdminDetails convert(AdminEntity entity){
        AdminDetails adminDetails = new AdminDetails();
        adminDetails.setId(entity.getId());
        adminDetails.setUsername(entity.getUsername());
        adminDetails.setEmail(entity.getEmail());
        adminDetails.setPassword(entity.getPassword());
        return adminDetails;
    }
}
