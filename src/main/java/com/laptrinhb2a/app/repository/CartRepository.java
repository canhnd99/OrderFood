package com.laptrinhb2a.app.repository;

import com.laptrinhb2a.app.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
