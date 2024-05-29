package com.fish.anr_seafoods_erp.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "anr_vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(name="harbour_address")
    private String harbourAddress;

    @Column(name="phone_no", unique = true)
    private String phoneNo;

    private Short age;

    @Column(name="profile_pic")
    private String profilePic;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }



}
