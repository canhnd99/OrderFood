package com.laptrinhb2a.app.converter;

import com.laptrinhb2a.app.dto.AdminDto;
import com.laptrinhb2a.app.entity.AdminEntity;

public class EntityToDto {
    public static AdminDto convert(AdminEntity entity){
        AdminDto dto = new AdminDto();
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        return dto;
    }
}
