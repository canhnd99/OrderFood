package com.laptrinhb2a.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    private String code;
    private String name;
    public CategoryDto(String code, String name){
        this.code = code;
        this.name = name;
    }
}
