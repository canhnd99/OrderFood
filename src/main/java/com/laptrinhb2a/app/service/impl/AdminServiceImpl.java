package com.laptrinhb2a.app.service.impl;

import com.laptrinhb2a.app.converter.DtoToEntity;
import com.laptrinhb2a.app.converter.EntityToDto;
import com.laptrinhb2a.app.dto.AdminDto;
import com.laptrinhb2a.app.entity.AdminEntity;
import com.laptrinhb2a.app.repository.AdminRepository;
import com.laptrinhb2a.app.service.AdminService;
import com.laptrinhb2a.app.utils.GenerateEncodePassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminDto save(AdminDto dto) {
        AdminEntity admin = adminRepository.findAdminByEmail(dto.getEmail());
        if (admin == null) {
            admin = DtoToEntity.convert(dto);
            admin.setPassword(GenerateEncodePassword.getEncodePassword(dto.getPassword()));
            admin = adminRepository.save(admin);
            return EntityToDto.convert(admin);
        } else {
            System.out.println("This username is used!");
        }
        return null;
    }
}
