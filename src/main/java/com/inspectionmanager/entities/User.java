package com.inspectionmanager.entities;

import com.inspectionmanager.services.UserProfile;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TUSER")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String cpfCnpj;

    private UserProfile profile;

    private String password;

    private String name;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.profile == UserProfile.ADMIN) {
            return List.of(new SimpleGrantedAuthority("PROFILE_ADMIN"), new SimpleGrantedAuthority("PROFILE_USER"));
        } else {
            return List.of(new SimpleGrantedAuthority("PROFILE_USER"));
        }
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
