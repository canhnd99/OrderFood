package com.laptrinhb2a.app.converter;

import com.laptrinhb2a.app.dto.AdminDto;
import com.laptrinhb2a.app.entity.AdminEntity;

public class DtoToEntity {
    public static AdminEntity convert(AdminDto dto){
        AdminEntity entity = new AdminEntity();
        entity.setUsername(dto.getUsername());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        return entity;
    }
}
