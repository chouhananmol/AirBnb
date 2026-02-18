package com.anmol.AirBnb.dto;

import java.time.LocalDate;

import com.aman.AirBnb.AirBnb.Enums.Gender;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
