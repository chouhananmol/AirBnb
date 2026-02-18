package com.anmol.AirBnb.service.interfaces;

import com.anmol.AirBnb.dto.ProfileUpdateRequestDTO;
import com.anmol.AirBnb.dto.UserDTO;
import com.anmol.AirBnb.entity.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
