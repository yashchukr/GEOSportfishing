package top.geosportfishing.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {

    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "creator")
    private String creator;


    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLE_SEQ")
    @SequenceGenerator(sequenceName = "role_seq", allocationSize = 1, name = "ROLE_SEQ")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }


}
