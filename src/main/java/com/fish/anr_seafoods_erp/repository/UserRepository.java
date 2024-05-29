package com.fish.anr_seafoods_erp.repository;

import com.fish.anr_seafoods_erp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
