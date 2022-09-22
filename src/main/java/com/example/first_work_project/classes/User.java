package com.example.first_work_project.classes;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    private int user_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_id")
    private Application application;

    @Column
    private boolean delete_as_soon_as_possible;

    @Column
    private Timestamp will_be_deleted_after;

    @Column
    private Timestamp date_of_creation;
}
