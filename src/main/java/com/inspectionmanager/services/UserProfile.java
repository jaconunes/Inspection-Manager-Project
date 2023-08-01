package com.inspectionmanager.services;

public enum UserProfile {

    ADMIN("Administrador"),
    USER("Padrão");

    private String profile;
    UserProfile(String profile) {
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }
}
