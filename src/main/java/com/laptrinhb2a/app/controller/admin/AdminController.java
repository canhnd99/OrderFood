package com.laptrinhb2a.app.controller.admin;

import com.laptrinhb2a.app.dto.AdminDto;
import com.laptrinhb2a.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@EnableAutoConfiguration
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String showAdminPage(){
        return "admin/page";
    }

    @GetMapping("/admin/about")
    public String showAdminAboutPage(){
        return "admin/about";
    }

    @GetMapping("/login")
    public String showAdminLoginPage(){
        return "admin/login";
    }

    @GetMapping("/admin/register")
    public String showAdminRegisterPage(Model model){
        model.addAttribute("adminRegister", new AdminDto());
        return "admin/registration";
    }

    @PostMapping("/admin/register")
    public String registerAdminAccount(@ModelAttribute AdminDto dto){
        adminService.save(dto);
        return "admin/page";
    }
}
