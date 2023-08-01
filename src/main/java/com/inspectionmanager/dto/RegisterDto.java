package com.inspectionmanager.dto;

import com.inspectionmanager.services.UserProfile;

public record RegisterDto(String userName, String password, String cpfCnpj, UserProfile profile, String name) {
}
