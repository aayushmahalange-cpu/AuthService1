package org.example.entities;
import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@Data//-> @builder+@getters+@setters
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class UserInfo {

    @Id
    @Column(name="user_id")
    private String userId;
    private String username;
    private String passward;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="users_roles",
            joinColumns = @JoinColumn (name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<UserRole> roles = new HashSet<>();

}
