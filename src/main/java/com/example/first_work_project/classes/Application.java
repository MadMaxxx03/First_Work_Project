package com.example.first_work_project.classes;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @Column
    private int application_id;

    @Column
    private int kb_amount_limit;

    @Column
    private int user_amount_limit;

    @Column
    private String token;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String salt;

    @Column
    private boolean has_access;

    @Column
    private Timestamp date_of_expiration;

    @OneToMany(mappedBy = "application", fetch = FetchType.LAZY)
    private Set<User> users;
}
