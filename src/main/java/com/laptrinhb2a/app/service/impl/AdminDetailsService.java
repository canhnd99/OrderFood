package com.laptrinhb2a.app.service.impl;

import com.laptrinhb2a.app.converter.EntityToAdminDetails;
import com.laptrinhb2a.app.entity.AdminEntity;
import com.laptrinhb2a.app.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AdminDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AdminEntity entity = adminRepository.findAdminByEmail(email);
        System.out.println(entity.getEmail());
        if(entity != null){
            return EntityToAdminDetails.convert(entity);
        }
        return null;
    }
}
